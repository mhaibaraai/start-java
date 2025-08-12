/*
 * @Author yixuanmiao
 * @Date 2025/08/12 15:42
 */

package com.movk.lambda;

import com.movk.extentsconstructor.Student;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {

        Student[] students = {
                new Student("Alice", 20),
                new Student("Bob", 22),
                new Student("Charlie", 19)
        };

        // 使用方法引用输出学生信息
        // students.forEach(System.out::println);
        // Arrays.of(students).forEach
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("姓名: " + students[i].getName() + ", 年龄: " + students[i].getAge());
//        }

        // 使用 Comparator 对学生数组进行排序
//        Arrays.sort(students,new Comparator<Student>() {
//            @Override22
//            public int compare(Student o1, Student o2) {
//                // 按年龄升序排序
//                return Integer.compare(o1.getAge(), o2.getAge());
//            }
//        });
        // 使用 Lambda 表达式简化 Comparator
//        Arrays.sort(students,(o1, o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        // 使用方法引用简化 Comparator
        Arrays.sort(students,Student::compareByAge);

        // 输出排序后的学生信息
//        for (Student student : students) {
//            System.out.println("姓名: " + student.getName() + ", 年龄: " + student.getAge());
//        }
        Arrays.stream(students).forEach(System.out::println);
    }
}
