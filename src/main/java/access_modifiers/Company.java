package access_modifiers;

public class Company {
    static String companyName;
    final int EMPLOYEE_ID;
    String employeeName;

    Company(int employeeId, String employeeName) {
        this.EMPLOYEE_ID = employeeId;
        this.employeeName = employeeName;
    }

    static void printCompanyName() {
        System.out.println(Company.companyName);
    }

    String getEmployeeName() {
        return this.employeeName;
    }

    void setEmployeeName(String name) {
        this.employeeName = name;
    }

}
