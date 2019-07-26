package com.coddicted.school.student.repository;

import com.coddicted.school.student.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.time.LocalDate;
import java.util.List;

public interface StudentRepository extends MongoRepository<Student, String>
{
    List<Student> findAll();
    List<Student> findAllByFirstName(String firstName);
    List<Student> findAllByLastName(String lastName);
    List<Student> findAllByMiddleName(String middleName);
    List<Student> findAllByFirstNameAndLastName(String firstName, String lastName);
    List<Student> findAllByFirstNameAndMiddleNameAndLastName(String firstName, String middleName, String lastName);
    List<Student> findAllByDateOfBirth(LocalDate dateOfBirth);
    List<Student> findAllByCaste(String caste);
    List<Student> findAllByCategory(String category);
    List<Student> findAllByReligion(String religion);

    Student findByAadharNumber(String aadharNumber);
}
