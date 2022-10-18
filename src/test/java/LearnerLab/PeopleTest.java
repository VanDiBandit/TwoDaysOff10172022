package LearnerLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {
    @Test
    public void testAdd(){
        Student student = new Student(0, 501L, "Digger");
        People people = new People();
        people.add(student);

        assertTrue(people.contains(student));
    }

    @Test
    public void testRemove(){
        int expected = 1;
        Student student = new Student(0, 401L,"Debby");
        People people = new People();
        people.remove(student);
        assertEquals(expected, people.count());
    }
    @Test
    public void testFindById(){
        Student student = new Student(9.0, 5679L, "Carl");
        Student student1 = new Student(10.0, 2468L, "Jake");
        People people = new People();
        people.add(student);
        people.add(student1);
        people.findByID(5679L);
        assertEquals(student, people.findByID(5679L));
    }
}