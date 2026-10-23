package collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTasks {
//    Задача 1:
//    Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.

//    Задача 2:
//    Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

//    Задача 3:
//    Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).

    static void main() {
        LinkedHashMap<String, String> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Alex", "346346346");
        phoneBook.put("Bbb", "356745775");
        phoneBook.put("Nick", "9808068");
        phoneBook.put("Lucas", "1413253");
        phoneBook.put("Jason", "8358576");

        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
            Utils.printValue(entry);
        }

        Utils.printValue(phoneBook.get("Lucas"));

        LinkedHashMap<String, String> history = new LinkedHashMap<>() {
            @Override
            public String put(String key, String value) {
                if (this.size() == 10 && !this.containsKey(key)) {
                    this.pollFirstEntry();
                    return super.put(key, value);
                }

                return super.put(key, value);
            }
        };

        history.put("id1", "main-page");
        history.put("id2", "login-page");
        history.put("id3", "about-page");
        history.put("id4", "random-page");
        history.put("id5", "page-1");
        history.put("id6", "second-page");
        history.put("id7", "contacts-page");
        history.put("id8", "contacts-page");
        history.put("id9", "contacts-page");
        history.put("id10", "contacts-page");
        history.put("id2", "new-contacts-page");
        history.put("id11", "page");


        Utils.printValue(history);

    }
}
