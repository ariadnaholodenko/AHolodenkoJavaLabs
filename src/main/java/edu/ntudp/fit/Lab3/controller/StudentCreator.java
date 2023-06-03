package edu.ntudp.fit.Lab3.controller;

import edu.ntudp.fit.Lab3.model.Group;
import edu.ntudp.fit.Lab3.model.Sex;
import edu.ntudp.fit.Lab3.model.Student;

public class StudentCreator {
    public Student createStudent(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        return new Student(firstName, lastName, patronymic, sex, group);
    }
}
