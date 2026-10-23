package collections;

import java.util.TreeMap;

public class TreeMapTasks {
    //    Задача 1:
//    Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
//    Задача 2:
//    Найдите минимальный и максимальный ключ в TreeMap.
//    Задача 3:
//    Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
    static void main() {
        TreeMap<String, Integer> usersScores = new TreeMap<>();
        usersScores.put("Alex", 100);
        usersScores.put("Bob", 90);
        usersScores.put("Jane", 100);
        usersScores.put("Sofia", 120);
        usersScores.put("Andy", 77);

        Utils.printValue(usersScores); // ключи сортированы по алфавиту

        Utils.printWithText("Максимальный ключ - %s%n", usersScores.lastKey());
        Utils.printWithText("Минимальный ключ - %s ", usersScores.firstKey());

        TreeMap<Integer, String> workers = new TreeMap<>();

        workers.put(100, "Alex");
        workers.put(90, "Bob");
        workers.put(123, "Jane");
        workers.put(44, "Sofia");
        workers.put(1, "Andy");

        Utils.printValue(workers.higherKey(70));
        Utils.printValue(workers.lowerKey(46));

    }
}
