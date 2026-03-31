package oop.park;

public class RollerCoaster extends Attraction {
    public RollerCoaster(String name) {
        super(name);
    }

    @Override
    void info() {
        System.out.println("Американские горки " + this.getName() + " быстрые и опасные");
    }

    @Override
    void service() {
        System.out.println("Американские горки  " + this.getName() + " требуют проверки безопасности");
    }
}
