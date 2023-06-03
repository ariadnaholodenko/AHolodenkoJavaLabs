package edu.ntudp.fit.Lab3.model;

public class Student extends Human {
    private Group group;

    public Student(String firstName, String lastName, String patronymic, Sex sex, Group group) {
        super(firstName, lastName, patronymic, sex);
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student Information:" +
                "\nІм'я: " + getFirstName() + " " + getLastName() +
                "\nПо батькові: " + getPatronymic() +
                "\nСтать: " + getSex() +
                "\nГрупа: " + group.getName();
    }
}
