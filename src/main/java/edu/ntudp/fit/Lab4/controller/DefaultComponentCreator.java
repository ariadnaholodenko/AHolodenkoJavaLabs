package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.ComponentCreator;
import edu.ntudp.fit.Lab4.model.*;

public class DefaultComponentCreator implements ComponentCreator {
    @Override
    public University createUniversity(String name) {
        return new University(name);
    }

    @Override
    public Faculty createFaculty(String name, Human dean) {
        return new Faculty(name, dean);
    }

    @Override
    public Department createDepartment(String name, Human head) {
        return new Department(name, head);
    }

    @Override
    public Group createGroup(String name) {
        return new Group(name);
    }

    @Override
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}



