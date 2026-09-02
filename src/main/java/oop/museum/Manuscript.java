package oop.museum;

public class Manuscript extends Exhibit {
    public Manuscript(String name) {
        super(name);
    }

    @Override
    void showHistory() {
        System.out.println("Древний манускрипт " + this.getName());
    }

    @Override
    void preserve() {
        System.out.println("требует контролируемой влажности");
    }
}
