package com.example.studentmanagementapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public Student getStudent(int PRN){
        return studentRepository.getStudent(PRN);

    }

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
        return;
    }

    public Student getStudentUsingPath(int PRN) {
        return studentRepository.getStudentUsingPath( PRN);
    }

    public Student updateAge(int prn, int newAge) {
        return studentRepository.updateAge(prn,newAge);
    }
}
