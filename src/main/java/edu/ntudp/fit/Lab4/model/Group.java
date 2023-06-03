package edu.ntudp.fit.Lab4.model;

import java.util.ArrayList;
import java.util.List;

public class Group extends UniversityComponent {
    private List<Student> students;

    public Group(String name) {
        super(name, null);
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }
}