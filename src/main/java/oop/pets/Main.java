package oop.pets;

public class Main {
    public static void main(String[] args) {
        Pet boris = new Cat("Борис");
        Pet sharik = new Dog("Шарик");
        Owner jonh = new Owner("Джон");

        jonh.setPet(boris);
        jonh.feed();
        jonh.interact();

        jonh.setPet(sharik);
        jonh.feed();
        jonh.interact();
    }
}
