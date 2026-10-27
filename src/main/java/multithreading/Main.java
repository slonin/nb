package multithreading;

public class Main {

    static int counter = 0;
    static volatile boolean stop = false;

    static Runnable incrementCounterTask = () -> {
        while (!stop) {
            counter++;
        }
    };

    static Runnable createPrintTask(String value) {
        return () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(value);
                if (i < 4) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
    }

    static void main() throws InterruptedException {
        Thread printHelloFromThread = new Thread(createPrintTask("Привет из потока!"));
        printHelloFromThread.start();

        Thread printA = new Thread(createPrintTask("A"));
        Thread printB = new Thread(createPrintTask("B"));

        printA.start();
        printB.start();

        Thread incrementThread = new Thread(incrementCounterTask);
        incrementThread.start();
        Thread.sleep(2000);
        stop = true;
    }
}
