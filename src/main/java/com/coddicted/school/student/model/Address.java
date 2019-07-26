package com.coddicted.school.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address
{
    private AddressType type;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String country;
    private String zip;
}
