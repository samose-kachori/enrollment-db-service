package com.coddicted.school.enrol.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @ApiModelProperty(notes = "Auto-generated student ID")
  private Integer id;

  @ApiModelProperty(notes = "Student first name")
  private String firstName;

  @ApiModelProperty(notes = "Student last name")
  private String lastName;

  @ApiModelProperty(notes = "Scholar register number")
  private String scholarRegisterNo;

  @ApiModelProperty(notes = "Student's religion")
  private String religion;

  @ApiModelProperty(notes = "Student's caste")
  private String caste;

  @ApiModelProperty(notes = "Student's category")
  private String category;

  @ApiModelProperty(notes = "Student's father's name")
  private String fatherName;

  @ApiModelProperty(notes = "Student's mother's name")
  private String motherName;

  @ApiModelProperty(notes = "Student's guardian name (if any applicable)")
  private String guardianName;

  @ApiModelProperty(notes = "Student's Aadhar (UIDAI) number")
  private String aadharNo;
  // Various date fields
  // TODO Need to check the data type for them
  @ApiModelProperty(notes = "Student's date of birth")
  private String dateOfBirth;

  // TODO Need to check placement of below field. Should it be placed in some other class?
  // this is because the date would change on class promotion/ school change.
  @ApiModelProperty(notes = "Student's date of admission at school")
  private String dateOfAdmission;
}
