package collections;

import java.util.LinkedHashSet;

public class LinkedHashSetTasks {
//    Задача 1:
//    Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.

//    Задача 2:
//    Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.

    static void addUniqueElement(LinkedHashSet<String> strings, String string) {
        if (strings.contains(string)) {
            Utils.printWithText("Элемент %s уже есть в коллекции%n", string);
        } else {
            strings.add(string);
            Utils.printWithText("Элемент %s добавлен в коллекцию", string);
        }
    }

    static void main() {
        LinkedHashSet<String> strings = new LinkedHashSet<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");

        Utils.printValue(strings); // порядок добавления сохраняется
        addUniqueElement(strings, "1");
        addUniqueElement(strings, "6");
    }
}
