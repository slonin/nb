package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
//    Задача 1:
//    Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.

//    Задача 2:
//    Проверьте, есть ли определённое имя в HashMap.

//    Задача 3:
//    Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.

    static void printUnder18(HashMap<String, Integer> users) {
        for (Map.Entry<String, Integer> entry : users.entrySet()) {
            if (entry.getValue() < 18) {
                Utils.printWithText("Пользователь %s меньше 18 лет%n", entry.getKey());
            }
        }
    }

    static void main() {
        HashMap<String, Integer> users = new HashMap<>();
        users.put("Peter", 20);
        users.put("Alex", 12);
        users.put("John", 17);
        users.put("Max", 34);
        users.put("Kevin", 20);

        Utils.printValue(users);
        Utils.printValue(users.containsKey("Max")); // true
        Utils.printValue(users.containsKey("Daniil")); // false

        printUnder18(users);
    }
}
