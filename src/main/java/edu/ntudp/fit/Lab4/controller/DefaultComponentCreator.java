package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.ComponentCreator;
import edu.ntudp.fit.Lab4.model.*;

public class DefaultComponentCreator implements ComponentCreator {
    public UniversityComponent createUniversity(String name) {
        return new University(name);
    }

    public Faculty createFaculty(String name, Human head) {
        return new Faculty(name, head);
    }

    public UniversityComponent createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}

