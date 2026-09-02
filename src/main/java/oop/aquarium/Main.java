package oop.aquarium;

public class Main {
    public static void main(String[] args) {
        SeaCreature patrick = new StarFish("Патрик");
        SeaCreature jaws = new Shark("Джарвис");

        Aquarium aquarium = new Aquarium();

        aquarium.setAnimal(patrick);
        aquarium.showBehave();

        aquarium.setAnimal(jaws);
        aquarium.showBehave();
    }
}
