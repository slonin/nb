package multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Stream;

public class ExecutorServiceTasks {

    static Callable<List<Integer>> createAnalyzeListTask(List<Integer> list, int fromIndex, int toIndex) {
        return () -> {
            List<Integer> newList = list.subList(fromIndex, toIndex);
            for (int i = fromIndex; i < toIndex; i++) {
                System.out.println("Индекс: " + i + ". Значение: " + list.get(i));
            }

            return newList;
        };
    }


    static void main() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        Callable<Integer> task = () -> {
            Thread.sleep(2000);

            return 10;
        };

        Future<Integer> res1 = executor.submit(task);
        Future<Integer> res2 = executor.submit(task);
        Future<Integer> res3 = executor.submit(task);
        Future<Integer> res4 = executor.submit(task);

        int result = res1.get() + res2.get() + res3.get() + res4.get();

        executor.shutdown();

        System.out.println(result);

        ExecutorService analyzeListExecutor = Executors.newFixedThreadPool(3);

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9));

        Future<List<Integer>> list1 = analyzeListExecutor.submit(createAnalyzeListTask(list, 0, 3));
        Future<List<Integer>> list2 = analyzeListExecutor.submit(createAnalyzeListTask(list, 3, 6));
        Future<List<Integer>> list3 = analyzeListExecutor.submit(createAnalyzeListTask(list, 6, 9));

        int elementsCount = list1.get().size() + list2.get().size() + list3.get().size();
        int elementsSum = Stream.of(list1.get(), list2.get(), list3.get())
                .flatMap(List::stream)
                .mapToInt(x -> x)
                .sum();

        System.out.println("Обработано элементов: " + elementsCount);
        System.out.println("Сумма элементов: " + elementsSum);

        analyzeListExecutor.shutdown();
    }
}