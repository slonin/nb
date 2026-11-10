package grade_service;

import complex_tasks.grade_service.GradeService;
import complex_tasks.grade_service.InvalidGradeException;
import complex_tasks.grade_service.StudentGrade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GradeServiceTest {
    @Test
    void gradeService_addValidGrade() {
        GradeService<Integer> gs = new GradeService<>();
        gs.addGrade(new StudentGrade<>("Albert", "Physics", 5));

        assertEquals(1, gs.getGrades().size());
    }

    @Test
    void gradeService_addInValidGrade() {
        GradeService<Integer> gs = new GradeService<>();

        assertThrows(InvalidGradeException.class, () -> gs.addGrade(new StudentGrade<>("Albert", "Physics", -1)));
    }

    @Test
    void gradeService_getAverageGrade() {
        GradeService<Integer> gs = new GradeService<>();
        gs.addGrade(new StudentGrade<>("Albert", "Physics", 5));
        gs.addGrade(new StudentGrade<>("Albert", "Physics", 2));
        gs.addGrade(new StudentGrade<>("Albert", "Physics", 5));

        assertEquals(4.0, gs.getAverageGradeBySubject("Physics"));
    }
}
