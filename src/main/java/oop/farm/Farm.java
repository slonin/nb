package oop.farm;

public class Farm {
    private Pet pet = null;

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void servicePet() {
        this.pet.care();
        this.pet.produce();
        this.pet.feed();
    }
}
