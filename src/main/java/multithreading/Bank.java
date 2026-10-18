package multithreading;

public class Bank {
    static void main() throws InterruptedException {
        BankAccount visa = new BankAccount("Visa", 10000);
        BankAccount mc = new BankAccount("Mastercard", 7000);

        Runnable transferMoneyTask = () -> {
            visa.transferMoneyToAccount(mc, 2000);
        };

        Thread transferThread1 = new Thread(transferMoneyTask);
        Thread transferThread2 = new Thread(transferMoneyTask);

        transferThread1.start();
        transferThread2.start();

        transferThread1.join();
        transferThread2.join();
        
        System.out.println(visa.getMoney());
        System.out.println(mc.getMoney());
    }
}
