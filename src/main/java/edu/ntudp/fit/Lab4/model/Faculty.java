package edu.ntudp.fit.Lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Faculty extends Component {
    private List<Department> departments;

    public Faculty(String name, Human dean) {
        super(name, dean);
        this.departments = new ArrayList<>();
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Faculty faculty = (Faculty) o;
        return Objects.equals(departments, faculty.departments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), departments);
    }
}


