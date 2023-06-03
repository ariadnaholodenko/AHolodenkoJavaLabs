package edu.ntudp.fit.Lab3.model;

import java.util.ArrayList;
import java.util.List;

public class University extends UniversityComponent {
    private List<UniversityComponent> faculties;

    public University(String name) {
        super(name, null);
        this.faculties = new ArrayList<>();
    }

    public List<UniversityComponent> getFaculties() {
        return faculties;
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
}

