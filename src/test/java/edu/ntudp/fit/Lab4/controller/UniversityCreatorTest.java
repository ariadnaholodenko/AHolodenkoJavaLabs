package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.controller.UniversityCreator;
import edu.ntudp.fit.Lab4.model.University;
import org.junit.Test;

public class UniversityCreatorTest {

    @Test
    public void testSaveUniversityToJsonFile() {
        UniversityCreator universityCreator = new UniversityCreator();
        University oldUniversity = universityCreator.createTypicalUniversity("Your University Name");
        String filePath = "path/to/university.json";

        universityCreator.saveUniversityToJsonFile(oldUniversity, filePath);
    }
}





