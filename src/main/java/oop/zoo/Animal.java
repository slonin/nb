package oop.zoo;

public abstract class Animal {
    private String name = null;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void move();
    abstract void sound();
}
