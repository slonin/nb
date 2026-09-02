package oop.restaurant;

public class Main {
    public static void main(String[] args) {
        Dish beer = new Drink("Гиннес", 0.5);
        Dish steak = new HotDish("Стейк", 45);

        Menu barMenu = new Menu();
        barMenu.setDish(beer);
        barMenu.showDishDescription();

        Menu dishMenu = new Menu();
        dishMenu.setDish(steak);
        dishMenu.showDishDescription();
    }
}
