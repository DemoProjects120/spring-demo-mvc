package com.rootnext.spring.demoapp.controllers;

import com.rootnext.spring.demoapp.models.Student;
import com.rootnext.spring.demoapp.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * Created by sanjoy on 8/25/15.
 */
@RestController
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @RequestMapping(value = "student", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE )
    public Iterable<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @RequestMapping(value = "student/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Student getStudent(@PathVariable(value = "id")Long id){
        return studentRepository.findOne(id);
    }

    @RequestMapping(value = "student", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE )
    public Student createStudent(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "registrationNo", required = true) String registrationNo){
        Student student = new Student();
        student.setName(name);
        student.setRegistrationNo(registrationNo);
        studentRepository.save(student);
        return student;
    }

    @RequestMapping(value = "student/{id}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE )
    public Student updateStudent(@PathVariable(value = "id")Long id, @RequestParam(value = "name", required = false) String name, @RequestParam(value = "registrationNo", required = false) String registrationNo){
        Student student = studentRepository.findOne(id);
        if(name!=null){
            student.setName(name);
        }
        if(registrationNo!=null){
            student.setRegistrationNo(registrationNo);
        }
        studentRepository.save(student);
        return student;
    }
}
