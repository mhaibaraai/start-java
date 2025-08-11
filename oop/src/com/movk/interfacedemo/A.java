/*
 * @Author yixuanmiao
 * @Date 2025/08/11 17:07
 */

package com.movk.interfacedemo;

public interface A {
    // 接口中的变量
    String CONSTANT_A = "A 的常量";

    // 静态方法（Java 8 引入）
    static void staticMethod() {
        System.out.println("这是 A 接口的静态方法。");
    }

    /**
     * 接口中的方法默认是 public abstract 的
     * 接口中的变量默认是 public static final 的
     * 接口中的方法不能有方法体，除非是 Java 8 引入的默认方法或静态方法
     */
    void methodA();

    // 默认方法（Java 8 引入）
    default void defaultMethod() {
        System.out.println("这是 A 接口的默认方法。");

        privateMethod(); // 可以调用私有方法
    }

    // 私有方法（Java 9 引入）
    private void privateMethod() {
        System.out.println("这是 A 接口的私有方法。");
    }
}
