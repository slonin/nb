package oop.garden;

public class Garden {
    Plant plant = null;

    public void setPlant(Plant plant) {
        this.plant = plant;
    }

    void care() {
        if (this.plant != null) {
            this.plant.care();
        }
    }
}
