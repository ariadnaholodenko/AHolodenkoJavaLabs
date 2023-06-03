package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.controller.UniversityCreator;
import edu.ntudp.fit.Lab4.model.University;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityCreatorTest {

    @Test
    public void testUniversityDeserialization() {
        UniversityCreator universityCreator = new UniversityCreator();
        String filePath = "path/to/university.json";

        University oldUniversity = universityCreator.loadUniversityFromJsonFile(filePath);
        University newUniversity = universityCreator.loadUniversityFromJsonFile(filePath);

        assertEquals(oldUniversity, newUniversity);
    }
}




