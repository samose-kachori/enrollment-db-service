package com.coddicted.school.student.model;

import java.time.LocalDate;
import java.util.List;

public interface Person
{
    String getAadharNumber();
    void setAadharNumber(String aadharNumber);

    Gender getGender();
    void setGender(Gender gender);

    String getFirstName();
    void setFirstName(String firstName);

    String getMiddleName();
    void setMiddleName(String middleName);

    String getLastName();
    void setLastName(String lastName);

    LocalDate getDateOfBirth();
    void setDateOfBirth(LocalDate dateOfBirth);

    List<Email> getEmailList();
    void setEmailList(List<Email> emailList);

    List<Phone> getPhoneList();
    void setPhoneList(List<Phone> phoneList);
}
