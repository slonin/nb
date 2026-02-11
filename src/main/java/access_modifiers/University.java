package access_modifiers;

public class University {
    static String universityName;
    final int STUDENT_ID;
    String studentName;

    University(int studentID, String studentName) {
        this.STUDENT_ID = studentID;
        this.studentName = studentName;
    }

    static void changeUniversityName(String newName) {
        University.universityName = newName;
    }

    String getStudentName() {
        return this.studentName;
    }

    void printStudentInfo() {
        System.out.println("Имя студента: " + this.studentName + ". ID: " + this.STUDENT_ID + ". Университет: " + University.universityName);
    }
}
