package oop.aquarium;

public class Aquarium {
    SeaCreature seaCreature = null;

    public void setAnimal(SeaCreature seaCreature) {
        this.seaCreature = seaCreature;
    }

    void showBehave() {
        if (this.seaCreature != null) {
            this.seaCreature.move();
        }
    }
}
