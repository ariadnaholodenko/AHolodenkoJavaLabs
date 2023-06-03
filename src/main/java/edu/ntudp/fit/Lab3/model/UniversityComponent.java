package edu.ntudp.fit.Lab3.model;

public abstract class UniversityComponent {
    private String name;
    private Human head;

    public UniversityComponent(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public Human getHead() {
        return head;
    }
}

