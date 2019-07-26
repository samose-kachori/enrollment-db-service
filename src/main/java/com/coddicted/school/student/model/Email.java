package com.coddicted.school.student.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Email
{
    private EmailType type;
    private String value;
}
