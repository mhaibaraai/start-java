package com.movk.extentsconstructor;

public class Teacher  extends People {

    private String subject;

    public Teacher() {
        // Default constructor
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", subject='" + subject + '\'' +
                '}';
    }
}
