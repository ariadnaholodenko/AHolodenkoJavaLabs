package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.ComponentCreator;
import edu.ntudp.fit.Lab4.model.*;
import edu.ntudp.fit.Lab4.JsonManager;
import edu.ntudp.fit.Lab4.util.FileUtils;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UniversityCreator {
    private ComponentCreator componentCreator;

    public UniversityCreator(ComponentCreator componentCreator) {
        this.componentCreator = componentCreator;
    }

    public University createTypicalUniversity(String name) {
        University university = (University) componentCreator.createUniversity(name);

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

    public University loadUniversityFromJsonFile(String filePath) {
        JsonManager jsonManager = new JsonManager();
        String json;

        try {
            json = FileUtils.readFile(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

        return jsonManager.fromJson(json, University.class);
    }

    public void saveUniversityToJsonFile(University university, String filePath) {
        // Create an instance of JsonManager
        JsonManager jsonManager = new JsonManager();

        // Convert the University object to JSON string
        String json = jsonManager.toJson(university);

        try (FileWriter fileWriter = new FileWriter(filePath)) {
            // Write the JSON string to the file
            fileWriter.write(json);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}


