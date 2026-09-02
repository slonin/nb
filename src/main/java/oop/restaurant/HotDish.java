package oop.restaurant;

public class HotDish extends  Dish {
    private int temperature = 0;

    public HotDish(String name, int temperature) {
        super(name);
        this.temperature = temperature;
    }

    @Override
    void showDescription() {
        System.out.println("Блюдо " + this.getName() + " подается при температуре " + this.temperature + " градусов");
    }
}
