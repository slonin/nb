package oop.zoo;

public class Zoo {
    Animal animal = null;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    void showBehave() {
        if (this.animal != null) {
            this.animal.sound();
            this.animal.move();
        }
    }
}
