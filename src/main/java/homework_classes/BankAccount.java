package homework_classes;

public class BankAccount {
    String owner;
    int balance;

    BankAccount(String owner, int balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return this.owner;
    }

    int getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    void deposit(int money) {
        this.balance = this.balance + money;
    }

    void withdraw(int money) {
        this.balance = this.balance - money;
    }

    void printBalance() {
        System.out.println("Текущий баланс: " + this.balance);
    }
}
