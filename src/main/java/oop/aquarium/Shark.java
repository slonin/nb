package oop.aquarium;

public class Shark extends SeaCreature {
    public Shark(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Акула " + this.getName() + " плавает быстро и агрессивно");
    }
}
