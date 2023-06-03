package edu.ntudp.fit.Lab3.controller;

import edu.ntudp.fit.Lab3.ComponentCreator;
import edu.ntudp.fit.Lab3.model.*;
public class UniversityCreator {
    private ComponentCreator componentCreator;

    public UniversityCreator(ComponentCreator componentCreator) {
        this.componentCreator = componentCreator;
    }

    public University createTypicalUniversity(String name) {
        University university = (University) componentCreator.createUniversity("НТУ ДП");

        Faculty faculty1 = componentCreator.createFaculty("Інформаційних технологій", new Human("Дмитро", "Дмитренко", "Дмитрович", Sex.MALE));
        university.addFaculty(faculty1);
        Faculty faculty2 = componentCreator.createFaculty("Гуманітарних наук", new Human("Анастасія", "Малежик", "Юріївна", Sex.FEMALE));
        university.addFaculty(faculty2);

        Department department1 = (Department) componentCreator.createDepartment("Системного аналізу", new Human("Дмитро", "Дмитренко", "Дмитрович", Sex.MALE));
        faculty1.addDepartment(department1);
        Department department2 = (Department) componentCreator.createDepartment("Філософії та педагогіки", new Human("Анастасія", "Малежик", "Юріївна", Sex.FEMALE));
        faculty2.addDepartment(department2);

        Group group1 = new Group("124-20-2");
        Student student1 = (Student) componentCreator.createStudent("Дмитро", "Дмитренко", "Дмитрович", Sex.MALE, group1);
        department1.addStudent(student1);

        Group group2 = new Group("033-19-1");
        Student student2 = (Student) componentCreator.createStudent("Анастасія", "Малежик", "Юріївна", Sex.FEMALE, group2);
        department2.addStudent(student2);


        System.out.println("Університет: " + university.getName());
        System.out.println("\nФакультет: " + faculty1.getName());
        System.out.println("Кафедра: " + department1.getName());
        System.out.println(student1.toString());

        System.out.println("\nФакультет: " + faculty2.getName());
        System.out.println("Кафедра: " + department2.getName());
        System.out.println(student2.toString());

        return university;
    }
}


