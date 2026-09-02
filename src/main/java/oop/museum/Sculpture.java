package oop.museum;

public class Sculpture extends Exhibit {
    public Sculpture(String name) {
        super(name);
    }

    @Override
    void showHistory() {
        System.out.println("Древняя скульптура " + this.getName());
    }

    @Override
    void preserve() {
        System.out.println("нуждается в реставрации");
    }

}
