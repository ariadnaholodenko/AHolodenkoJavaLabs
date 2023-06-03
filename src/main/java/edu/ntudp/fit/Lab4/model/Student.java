package edu.ntudp.fit.Lab4.model;

import java.util.Objects;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        super(firstName, lastName, patronymic, sex);
        this.group = group;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), group);
    }
}
