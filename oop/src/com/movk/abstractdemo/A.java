/*
 * @Author yixuanmiao
 * @Date 2025/08/11 17:07
 */

package com.movk.abstractdemo;

public abstract class A {
    private String name; // 抽象类的属性，可以被子类继承

    public A() {
        // 默认构造方法
    }

    public A(String name) {
        this.name = name; // 构造方法，子类可以通过 super 调用
    }

    // 抽象类 A，包含一个抽象方法和一个具体方法
    public abstract void doSomething(); // 抽象方法，子类必须实现

    public void commonMethod() {
        System.out.println("这是一个具体方法，可以被子类继承");
    }
}
