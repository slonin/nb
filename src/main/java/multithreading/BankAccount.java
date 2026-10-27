package multithreading;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private String name;
    private int money;
    static ReentrantLock lock = new ReentrantLock();

    public BankAccount(String name, int money) {
        this.name = name;
        this.money = money;
    }

    private void receiveMoney(int money) {
        this.money += money;
    }

    public int getMoney() {
        return money;
    }

    public void transferMoneyToAccount(BankAccount account, int money) {
        lock.lock();
        try {
            if (this.money >= money) {
                this.money -= money;
                account.receiveMoney(money);
            } else {
                // можно еще сделать проверку на отрицательное значение money
                throw new IllegalStateException("Недостаточно средств!");
            }
        } finally {
            lock.unlock();
        }
    }
}
