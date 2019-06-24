package com.coddicted.school.enrol.repo;

import org.springframework.data.repository.CrudRepository;

import com.coddicted.school.enrol.model.Student;

// This will be AUTO IMPLEMENTED by Spring into a Bean called StudentRepository
// CRUD refers Create, Read, Update, Delete

public interface StudentRepository extends CrudRepository<Student, Integer> {}
