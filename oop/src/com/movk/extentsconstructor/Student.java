package com.movk.extentsconstructor;

public class Student extends People {

    private String studentId;

    public Student() {
        // Default constructor
    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
