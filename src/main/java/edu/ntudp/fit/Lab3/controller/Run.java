package edu.ntudp.fit.Lab3.controller;

import edu.ntudp.fit.Lab3.ComponentCreator;
import edu.ntudp.fit.Lab3.model.*;

public class Run {
    public static void main(String[] args) {
        ComponentCreator componentCreator = new DefaultComponentCreator();
        UniversityCreator universityCreator = new UniversityCreator(componentCreator);
        University university = universityCreator.createTypicalUniversity("МійУніверситет");
    }
}

