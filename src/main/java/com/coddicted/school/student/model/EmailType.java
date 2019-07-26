package com.coddicted.school.student.model;

public enum EmailType
{
    HOME("Home"),
    WORK("Work"),
    SCHOOL("School"),
    OTHER("Other"),
    CUSTOM("Custom");

    private String name;

    EmailType(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return this.name;
    }
}
