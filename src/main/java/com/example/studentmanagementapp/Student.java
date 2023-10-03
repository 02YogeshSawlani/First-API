package com.example.studentmanagementapp;

public class Student {
    private int PRN;

    private String name;

    private int age;

    private String course;

    public Student() {
    }

    public Student(int PRN, String name, int age, String course) {
        this.PRN = PRN;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getPRN() {
        return PRN;
    }

    public void setPRN(int PRN) {
        this.PRN = PRN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

   /* @Override
    public String toString(){
        return "Student{" +
                "PRN=" + PRN +
                ", name"+ name + '\'' +
                ", age=" + age +
                ",course='" + course + '\'' +
                '}';
         }
    */

}
