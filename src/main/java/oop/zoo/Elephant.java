package oop.zoo;

public class Elephant extends Animal{
    public Elephant(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Слон " + this.getName() + " ходит");
    }

    @Override
    void sound() {
        System.out.println("Слон " + this.getName() + " трубит");
    }
}
