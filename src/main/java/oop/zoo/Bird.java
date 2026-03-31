package oop.zoo;

public class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Птица " + this.getName() + " летает");
    }

    @Override
    void sound() {
        System.out.println("Птица " + this.getName() + " чирикает");
    }
}
