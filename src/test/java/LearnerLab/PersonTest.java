package LearnerLab;

//Import test class

import org.testng.annotations.Test;
import org.junit.jupiter.api.Assertions;

public class PersonTest {
    //Set first test up
    @Test
    public void setNameTest(){
        //Given
        String expectedName = "Mikaila";
        long expectedID = ' ';

        //When
        //create person object
        Person person = new Person(' ', " ", 0);
        person.setName("Mikaila");

        //Then
        Assertions.assertEquals(expectedName,person.getName());
    }
}

