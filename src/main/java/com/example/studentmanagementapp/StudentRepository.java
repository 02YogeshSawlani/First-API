package com.example.studentmanagementapp;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<Integer,Student> db= new HashMap<>();

    public Student getStudent(int PRN){
          return db.get(PRN);
    }

    public void addStudent(Student student) {
        db.put(student.getPRN(),student);

    }
    public Student getStudentUsingPath(int PRN){
        return db.get(PRN);
    }

    public Student updateAge(int prn, int newAge) {
        db.get(prn).setAge(newAge);
        return db.get(prn);
    }
}
