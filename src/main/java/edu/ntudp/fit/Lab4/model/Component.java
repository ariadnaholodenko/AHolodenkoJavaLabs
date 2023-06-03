package edu.ntudp.fit.Lab4.model;

import java.util.Objects;

public abstract class Component {
    private String name;
    private Human head;

    public Component(String name, Human head) {
        this.name = name;
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human getHead() {
        return head;
    }

    public void setHead(Human head) {
        this.head = head;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Component component = (Component) o;
        return Objects.equals(name, component.name) &&
                Objects.equals(head, component.head);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, head);
    }
}
