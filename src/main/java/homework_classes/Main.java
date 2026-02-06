package homework_classes;

public class Main {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota", 2022);
        toyota.setYear(2021);
        toyota.print();

        Rectangle rect = new Rectangle(5, 6);
        rect.setWidth(10);
        System.out.println(rect.calculateArea());

        Book lordOfTheRings = new Book("Властелин Колец", "Толкиен");
        lordOfTheRings.setAuthor("Бильбо Беггинс");
        lordOfTheRings.printInfo();

        BankAccount userAccount = new BankAccount("Harry", 1000000);
        userAccount.deposit(150000);
        userAccount.withdraw(50000);
        userAccount.printBalance();
        userAccount.withdraw(1200000);
        userAccount.printBalance();
        userAccount.withdraw(-10);
        userAccount.deposit(0);
        userAccount.printBalance();

        Point coords = new Point(52.12345, 46.9876);
        coords.setX(55.5432);
        coords.print();

        Circle circle = new Circle(5);
        circle.setRadius(9);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCircumference());

        Teacher severus = new Teacher("Северус Снейп", "Зельеварение");
        severus.setSubject("Защита от темных сил");
        severus.printInfo();

        Product pasta = new Product("Спагетти", 250);
        pasta.setPrice(307);
        pasta.applyDiscount(19);
        pasta.printInfo();

        Laptop macbook = new Laptop("Apple", 250000);
        macbook.setPrice(270000);
        macbook.printInfo();

        StudentGroup group = new StudentGroup("0110", 18);
        group.setStudentCount(10);
        group.printInfo();
    }
}
