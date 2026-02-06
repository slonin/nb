package access_modifiers;

public class Main {
    public static void main(String[] args) {
        Company firstEmployee = new Company(65, "John");
        Company secondEmployee = new Company(66, "Max");
        Company.printCompanyName(); // null
        Company.companyName = "Apple";
        Company.printCompanyName(); // Apple
//      Ошибка
//      firstEmployee.EMPLOYEE_ID = 60;

        double area = MathConstants.calculateCircleArea(5);
        double circumference = MathConstants.calculateCircumference(10);
        System.out.println(area);
        System.out.println(circumference);

        University.changeUniversityName("Гарвард");

        University firstStudent = new University(10, "John");
        University secondStudent = new University(11, "Max");
        University thirdStudent = new University(12, "Derek");

        firstStudent.printStudentInfo();
        secondStudent.printStudentInfo();
        thirdStudent.printStudentInfo();

        University.changeUniversityName("Оксфорд");

        firstStudent.printStudentInfo();
        secondStudent.printStudentInfo();
        thirdStudent.printStudentInfo();

        GameSettings counterStrike = new GameSettings("Counter-Strike", 12);
        GameSettings fortnite = new GameSettings("Fortnite", 10);

        GameSettings.setMaxPlayers(12);

        counterStrike.printGameStatus();
        fortnite.printGameStatus();

        counterStrike.addPlayer();
        fortnite.addPlayer();

        counterStrike.printGameStatus();
        fortnite.printGameStatus();

        Person john = new Person("John", "Snow", "123-45-6789");
        Person robert = new Person("Robert", "Baratheon", "234-56-7891");

        john.setFirstName("Eigon");
        john.printPersonalInfo();
    }
}
