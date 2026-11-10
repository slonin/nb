package complex_tasks.grade_service;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private final List<StudentGrade<T>> grades = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("Минимальная оценка - 0");
        }

        grades.add(grade);
    }

    public synchronized double getAverageGradeBySubject(String subject) {
        return grades.stream()
                .filter((grade) -> grade.getSubject().equals(subject))
                .mapToDouble((grade) -> grade.getGrade().doubleValue())
                .average().orElseThrow(() -> new InvalidGradeException("По предмету " + subject + " нет оценок"));
    }

    public synchronized List<StudentGrade<T>> getGrades() {
        return List.copyOf(grades);
    }
}
