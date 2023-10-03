package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/get")  // GetMapping helps to give endpoint to API
    public Student getStudent(@RequestParam("q") int PRN)
    {
        return studentService.getStudent(PRN);
    }

    @PostMapping("/add")
    public String addStudent(@RequestBody Student student){
        studentService.addStudent(student);
        return "Student has been added successfully";
    }
    @GetMapping("/getByPath/{id}")
    public ResponseEntity getStudentUsingPath(@PathVariable("id") int PRN){

        Student student=studentService.getStudentUsingPath(PRN);
        if(student==null){
            return new ResponseEntity("Id doesn't exist", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity(student, HttpStatus.FOUND);
    }
    @PutMapping("/update.age/{id}")
    public Student updateAge(@PathVariable("id")int PRN, @RequestParam("age")int newAge){
        return studentService.updateAge(PRN,newAge);


    }

}
