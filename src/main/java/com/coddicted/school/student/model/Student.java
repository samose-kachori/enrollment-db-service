package com.coddicted.school.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.coddicted.school.student.constants.SwaggerConstant;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.Swagger;
import lombok.Data;

import java.time.LocalDate;

@Entity // This tells Hibernate to make a table out of this class
@Data
public class Student
{
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @ApiModelProperty(notes = SwaggerConstant.AUTO_GENERATED_STUDENT_ID)
  private Integer id;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_FIRST_NAME)
  private String firstName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_LAST_NAME)
  private String lastName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_REGISTRATION_NUMBER)
  private String studentRegistrationNumber;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_RELIGION)
  private String religion;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_CASTE)
  private String caste;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_CATEGORY)
  private String category;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_FATHER_NAME)
  private String fatherName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_MOTHER_NAME)
  private String motherName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_GUARDIAN_NAME)
  private String guardianName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_AADHAR_NUMBER)
  private String aadharNumber;
  // Various date fields
  // TODO Need to check the data type for them
  @ApiModelProperty(notes = SwaggerConstant.STUDENT_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  // TODO Need to check placement of below field. Should it be placed in some other class?
  // this is because the date would change on class promotion/ school change.
  @ApiModelProperty(notes = SwaggerConstant.STUDENT_DATE_OF_ADMISSION)
  private LocalDate dateOfAdmission;
}
