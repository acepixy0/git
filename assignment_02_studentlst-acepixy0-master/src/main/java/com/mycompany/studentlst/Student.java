package com.mycompany.studentlst;

/**
 *
 * @author Nathan Hagood
 */
public class Student {
    
    private String name;

    public Student(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
