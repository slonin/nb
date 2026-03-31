package oop.park;

public class Main {
    public static void main(String[] args) {
        Attraction formula = new RollerCoaster("Формула 1");
        Attraction dream = new Carousel("Полет фантазии");

        EntertainmentPark entertainmentPark = new EntertainmentPark();

        entertainmentPark.setAttraction(formula);
        entertainmentPark.maintain();
        entertainmentPark.showInfo();

        entertainmentPark.setAttraction(dream);
        entertainmentPark.maintain();
        entertainmentPark.showInfo();
    }
}
