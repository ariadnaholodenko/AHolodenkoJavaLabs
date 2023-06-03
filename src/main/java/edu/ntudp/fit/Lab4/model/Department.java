package edu.ntudp.fit.Lab4.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Department extends Component {
    private List<Student> students;

    public Department(String name, Human head) {
        super(name, head);
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Department that = (Department) o;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), students);
    }
}
