package oop.restaurant;

public class Drink extends Dish {
    private double size = 1;

    public Drink(String name, double size) {
        super(name);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    @Override
    void showDescription() {
        System.out.println("Напиток " + this.getName() + " подается в объеме " + this.size + " л");
    }
}
