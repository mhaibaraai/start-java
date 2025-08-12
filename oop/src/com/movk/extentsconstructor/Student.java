/*
 * @Author yixuanmiao
 * @Date 2025/08/12 14:23
 */

package com.movk.extentsconstructor;

public class Student extends People {

    private String studentId;
    private Integer age;

    public Student() {
        // Default constructor
    }

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public Student(String name, Integer age) {
        super(name, age);
        this.studentId = "S" + age; // Example logic for studentId
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

    public static int compareByAge(Student student, Student other) {
        return student.getAge() - other.getAge();
    }
}
