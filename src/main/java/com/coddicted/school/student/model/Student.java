package com.coddicted.school.student.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.coddicted.school.student.constants.SwaggerConstant;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.models.Swagger;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Entity // This tells Hibernate to make a table out of this class
@Data
@Getter
@Setter
public class Student implements Person
{
  @ApiModelProperty(notes = SwaggerConstant.STUDENT_AADHAR_NUMBER)
  private String aadharNumber;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_FIRST_NAME)
  private String firstName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_MIDDLE_NAME)
  private String middleName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_LAST_NAME)
  private String lastName;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_GENDER)
  private Gender gender;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_DATE_OF_BIRTH)
  private LocalDate dateOfBirth;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_PHONE_LIST)
  private List<Phone> phoneList;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_EMAIL_LIST)
  private List<Email> emailList;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_ADDRESS_LIST)
  private List<Address> addressList;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_RELIGION)
  private String religion;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_CASTE)
  private String caste;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_CATEGORY)
  private String category;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_FATHER_NAME)
  private Person father;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_MOTHER_NAME)
  private Person mother;

  @ApiModelProperty(notes = SwaggerConstant.STUDENT_GUARDIAN_NAME)
  private Person guardianName;

}
