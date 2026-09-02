package oop.museum;

public abstract class Exhibit {
    private String name = null;

    public Exhibit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void showHistory();
    abstract void preserve();
}
