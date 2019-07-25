package com.coddicted.school.student.model;

public enum AddressType
{
    HOME("Home"),
    BUSINESS("Business"),
    SCHOOL("School");

    private String name;

    AddressType(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return this.name;
    }
}
