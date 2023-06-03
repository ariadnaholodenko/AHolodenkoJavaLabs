package edu.ntudp.fit.Lab4.controller;

import edu.ntudp.fit.Lab4.model.Group;

public class GroupCreator {
    public Group createGroup(String name) {
        return new Group(name);
    }
}
