package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.ComponentCreator;
import edu.ntudp.fit.Lab4.model.University;

public class Run {
    public static void main(String[] args) {
        ComponentCreator componentCreator = new DefaultComponentCreator();
        UniversityCreator universityCreator = new UniversityCreator(componentCreator);
        University university = universityCreator.createTypicalUniversity("Нту ДП");
    }
}
