package oop.farm;

public abstract class Pet {
    private String name = null;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void care();
    abstract void produce();
    abstract void feed();
}
