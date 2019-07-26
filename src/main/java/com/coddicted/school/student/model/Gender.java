package com.coddicted.school.student.model;

public enum Gender
{
    MALE("Male"),
    FEMALE("Female"),
    OTHER("Other");

    private String name;

    Gender(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return this.name;
    }
}
