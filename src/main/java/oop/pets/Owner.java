package oop.pets;

public class Owner {
    private String name = null;
    private Pet pet = null;

    public Owner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void feed() {
        this.pet.eat();
    }

    public void interact() {
        this.pet.behave();
    }

}
