package LearnerLab;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    public void testImplementation(){
        //Given
        Student student = new Student(15.0, 101L, "Dirk");
        assertTrue((student instanceof Learner));
    }
    @Test
    public void testInheritance(){
        //Given
        Student student = new Student(15.0, 101L, "Dirk");
        assertTrue((student instanceof Person));
    }

    @Test
    public void testLearn(){
        Student student = new Student(15.0, 101l, "Dirk");
        student.learn(15.0);


        assertEquals(15.0, student.getTotalStudyTime());
    }

}