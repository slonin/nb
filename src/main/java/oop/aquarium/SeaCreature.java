package oop.aquarium;

public abstract class SeaCreature {
    private String name = null;

    public SeaCreature(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void move();
}
