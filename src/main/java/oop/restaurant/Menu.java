package oop.restaurant;

public class Menu {
    Dish dish = null;

    public void setDish(Dish dish) {
        this.dish = dish;
    }

    void showDishDescription() {
        if (dish != null) this.dish.showDescription();
    }
}
