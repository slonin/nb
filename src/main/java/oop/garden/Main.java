package oop.garden;

public class Main {
    public static void main(String[] args) {
        Plant bob = new Cactus("Боб");
        Plant red = new Orchid("Красная");

        Garden garden = new Garden();

        garden.setPlant(bob);
        garden.care();

        garden.setPlant(red);
        garden.care();
    }
}
