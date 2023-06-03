package edu.ntudp.fit.Lab4.model;

import java.util.ArrayList;
import java.util.List;

public class Department extends UniversityComponent {
    private List<Group> groups;

    public Department(String name, Human head) {
        super(name, head);
        groups = new ArrayList<>();
    }

    public void addGroup(Group group) {
        groups.add(group);
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void addStudent(Student student) {
        if (!groups.isEmpty()) {
            Group firstGroup = groups.get(0);
            firstGroup.addStudent(student);
        }
    }
}
