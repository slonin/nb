package oop.park;

public abstract class Attraction {
    private String name = null;

    public Attraction(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void info();
    abstract void service();
}
