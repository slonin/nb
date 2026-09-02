package oop.zoo;

public class Main {
    public static void main(String[] args) {
        Animal bob = new Elephant("Боб");
        Animal woody = new Bird("Вуди");

        Zoo zoo = new Zoo();

        zoo.setAnimal(bob);
        zoo.showBehave();

        zoo.setAnimal(woody);
        zoo.showBehave();
    }
}
