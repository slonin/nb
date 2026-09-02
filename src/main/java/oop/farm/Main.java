package oop.farm;

public class Main {
    public static void main(String[] args) {
        Pet burenka = new Cow("Буренка");
        Pet tsypa = new Chicken("Цыпа");
        Farm farm = new Farm();

        farm.setPet(burenka);
        farm.servicePet();

        farm.setPet(tsypa);
        farm.servicePet();
    }
}
