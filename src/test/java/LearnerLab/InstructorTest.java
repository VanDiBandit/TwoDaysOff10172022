package LearnerLab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {

    private Instructor instructor;

    @BeforeEach
    public void setUp() {
        instructor = new Instructor(567L, "Duke", 0);
    }
    @Test
    public void testImplentation(){
        assertTrue(instructor instanceof Teacher);

    }
    @Test
    public void testInheritance(){
        assertTrue(instructor instanceof Person);

    }
    @Test
    public void testTeach(){
        Student student = new Student(0, 90865L, "Kite");
        instructor.teach(student, 2.0);
        assertEquals(0, student.getTotalStudyTime());
    }
    @Test
    public void testLecture(){
        Student student = new Student(9.0, 87654L, "Amber");
        Student student1 = new Student(15.0,12345L, "Baka");
        Learner[] learners = {student, student1};
        instructor.lecture(learners, 7.0);
        assertEquals(3.5, student.totalStudyTime);

    }
}