package com.company;

import java.util.HashSet;

public class Person {
    private String name;
    private String email;
    private String colour;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    HashSet<Person> getMyInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<Person> getGetMyInfo() {
        return getMyInfo;
    }

    public void setGetMyInfo(HashSet<Person> getMyInfo) {
        this.getMyInfo = getMyInfo;
    }
}




