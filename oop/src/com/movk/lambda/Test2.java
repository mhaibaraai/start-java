/*
 * @Author yixuanmiao
 * @Date 2025/08/12 15:57
 */

package com.movk.lambda;

import java.util.Arrays;

public class Test2 {
    /**
     * 特定类型的方法引用
     * 有一个字符串数组，里面是人的姓名，包含英文和中文，现在需要按照名字的首字母进行排序。
     */
    public static void main(String[] args) {
        String[] names = {"张三", "李四", "王五", "Alice", "Bob", "Charlie", "anna", "Zoe"};

        // 使用 Arrays.sort() 方法对字符串数组进行排序
        // Arrays.sort(names);

        // 使用 Lambda 表达式对字符串数组进行排序
//         Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));

        // 使用方法引用对字符串数组进行排序
//         Arrays.sort(names, String::compareToIgnoreCase);

        // 输出排序后的姓名
        // Arrays.stream(names).forEach(System.out::println);
        System.out.println(Arrays.toString(names));
    }
}
