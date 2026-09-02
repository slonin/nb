package oop.restaurant;

public abstract class Dish {
    private String name;

    public Dish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void showDescription();
}
