package oop.garden;

public abstract class Plant {
    private String name = null;

    public Plant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void care();
}
