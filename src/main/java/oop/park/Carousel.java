package oop.park;

public class Carousel extends Attraction {
    public Carousel(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("Карусель " + this.getName() + " медленно крутится");
    }

    @Override
    void service() {
        System.out.println("Карусель " + this.getName() + " требует технического обслуживания");
    }
}
