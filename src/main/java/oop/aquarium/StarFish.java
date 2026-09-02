package oop.aquarium;

public class StarFish extends SeaCreature {
    public StarFish(String name) {
        super(name);
    }

    @Override
    void move() {
        System.out.println("Морская звезда " + this.getName() + " медленно ползает");
    }
}
