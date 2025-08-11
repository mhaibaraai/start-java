/*
 * @Author yixuanmiao
 * @Date 2025/08/11 21:20
 */

package com.movk.code;

import java.util.Arrays;

public class Test {
    public static String staticField;
    public static Number[] staticArray = new Number[10];

    // 静态代码块
    static {
        System.out.println("静态代码块执行");
        staticField = "静态字段初始化";
        for (int i = 0; i < staticArray.length; i++) {
            staticArray[i] = i * 10; // 初始化静态数组
        }
    }

    public static void main(String[] args) {
        System.out.println("main方法执行");
        // 测试静态代码块是否在类加载时执行
        Test test = new Test();
        System.out.println("Test对象创建完成");
        System.out.println("静态字段: " + staticField);
        System.out.print(Arrays.toString(staticArray));
        new Test();
    }
}
