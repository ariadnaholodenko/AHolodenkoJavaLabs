package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.ComponentCreator;
import edu.ntudp.fit.Lab4.model.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniversityCreatorTest {
    private UniversityCreator universityCreator;

    @Before
    public void setup() {
        ComponentCreator componentCreator = new DefaultComponentCreator();
        universityCreator = new UniversityCreator(componentCreator);
    }

    @Test
    public void testCreateTypicalUniversity() {
        String universityName = "Нту ДП";
        University oldUniversity = universityCreator.createTypicalUniversity(universityName);

        // Assert the oldUniversity name
        Assert.assertEquals(universityName, oldUniversity.getName());

        // Assert the number of faculties
        Assert.assertEquals(2, oldUniversity.getFaculties().size());

        // Assert the number of departments in the first faculty
        Faculty faculty1 = oldUniversity.getFaculties().get(0);
        Assert.assertEquals(1, faculty1.getDepartments().size());

        // Assert the number of departments in the second faculty
        Faculty faculty2 = oldUniversity.getFaculties().get(1);
        Assert.assertEquals(1, faculty2.getDepartments().size());

        // Assert the number of students in the first department
        Department department1 = faculty1.getDepartments().get(0);
        Assert.assertEquals(1, department1.getStudents().size());

        // Assert the number of students in the second department
        Department department2 = faculty2.getDepartments().get(0);
        Assert.assertEquals(1, department2.getStudents().size());

        // Create a new oldUniversity from the JSON file
        String filePath = "oldUniversity.json";
        try {
            universityCreator.saveUniversityToJsonFile(oldUniversity, filePath);
            University newUniversity = universityCreator.loadUniversityFromJsonFile(filePath);

            // Assert the equality of the old and new universities
            Assert.assertEquals(oldUniversity, newUniversity);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

