package multithreading;

public class Counter {
    static int counter = 0;

    static synchronized void increment() {
        counter++;
    }

    static void main() throws InterruptedException {
        Runnable incrementTask = () -> {
            for (int i = 0; i < 1000; i++) {
                increment();
            }
        };

        Thread firstIncrementThread = new Thread(incrementTask);
        Thread secondIncrementThread = new Thread(incrementTask);

        firstIncrementThread.start();
        secondIncrementThread.start();

        firstIncrementThread.join();
        secondIncrementThread.join();

        System.out.println(counter);
    }
}
