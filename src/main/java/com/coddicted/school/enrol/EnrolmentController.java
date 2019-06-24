package com.coddicted.school.enrol;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.coddicted.school.enrol.model.Student;
import com.coddicted.school.enrol.repo.StudentRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping(
    path = "/enrolment") // This means URL's start with /enrolment (after Application path)
@Api(description = "Student Enrolment API")
@Slf4j
public class EnrolmentController {

  @Autowired private StudentRepository studentRepository;

  @PostMapping(path = "/enrol") // Map ONLY GET Requests
  @ApiOperation(code = 200, value = "Enrol a new Student")
  public @ResponseBody String addNewStudent(@RequestBody Student student) {
    // @ResponseBody means the returned String is the response, not a view name
    // @RequestParam means it is a parameter from the GET or POST request

    log.info("logging the addNewStudent method inside MainController");

    Student savedStudent = studentRepository.save(student);
    return "Saved " + savedStudent.getId();
  }

  @GetMapping(path = "/all")
  @ApiOperation(code = 200, value = "Get all the enrolled students")
  public @ResponseBody Iterable<Student> getAllStudents() {
    // This returns a JSON or XML with the students
    return studentRepository.findAll();
  }
}
