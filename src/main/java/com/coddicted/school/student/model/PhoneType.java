package com.coddicted.school.student.model;

public enum PhoneType
{
    HOME("Home"),
    WORK("Work"),
    MAIN("Main"),
    WORK_FAX("Work Fax"),
    HOME_FAX("Home Fax"),
    PAGER("Pager"),
    OTHER("Other"),
    CUSTOM("Custom"),
    MOBILE("Mobile");


    private String name;

    PhoneType(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        return this.name;
    }
}
