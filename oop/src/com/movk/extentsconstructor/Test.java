/*
 * @Author yixuanmiao
 * @Date 2025/08/11 17:07
 */

package com.movk.extentsconstructor;

public class Test {

    public static void main(String[] args) {
        People people = new People("John", 30);
        System.out.println("Name: " + people.getName() + ", Age: " + people.getAge());

        Teacher teacher = new Teacher("Alice", 35, "Mathematics");
        System.out.println("Name: " + teacher.getName() + ", Age: " + teacher.getAge() + ", Subject: " + teacher.getSubject());

        Student student = new Student("Bob", 20, "S12345");
        System.out.println(student.toString());
    }
}
