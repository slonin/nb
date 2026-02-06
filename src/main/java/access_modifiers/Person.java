package access_modifiers;

public class Person {
    private String firstName;
    private String lastName;
    private final String SSN;

    Person(String firstName, String lastName, String ssn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.SSN = ssn;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    String getSSN() {
        return this.SSN;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void printPersonalInfo() {
        String info = String.format("Имя: %s, Фамилия: %s, SSN: %s", this.firstName, this.lastName, this.SSN);
        System.out.println(info);
    }
}
