package edu.ntudp.fit.Lab3.model;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends UniversityComponent {
    private List<Department> departments;

    public Faculty(String name, Human head) {
        super(name, head);
        departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public List<Department> getDepartments() {
        return departments;
    }
}



