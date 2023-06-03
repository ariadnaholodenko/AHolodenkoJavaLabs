package edu.ntudp.fit.Lab3.controller;

import edu.ntudp.fit.Lab3.model.Faculty;
import edu.ntudp.fit.Lab3.model.Human;

public class FacultyCreator {
    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }
}