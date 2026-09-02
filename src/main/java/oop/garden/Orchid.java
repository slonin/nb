package oop.garden;

public class Orchid extends Plant {
    public Orchid(String name) {
        super(name);
    }

    @Override
    void care() {
        System.out.println("Орхидея " + this.getName() + " требует высокую влажность и тень");
    }
}
