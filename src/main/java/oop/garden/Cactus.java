package oop.garden;

public class Cactus extends Plant {
    public Cactus(String name) {
        super(name);
    }

    @Override
    void care() {
        System.out.println("Кактус " + this.getName() + " требует много света и редкий полив");
    }
}
