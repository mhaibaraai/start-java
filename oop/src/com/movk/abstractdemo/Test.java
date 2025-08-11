/**
 * Copyright © 2025 Yixuan Miao
 */

package com.movk.abstractdemo;

public class Test extends A {
    public Test() {
        super("Test"); // 调用父类的构造方法
    }

    public static void main(String[] args) {

        // A = new A()

        Test test = new Test();
        test.doSomething(); // 调用实现的抽象方法
        test.commonMethod(); // 调用继承的具体方法
    }

    @Override
    public void doSomething() {
        System.out.println("Test 类实现了抽象方法 doSomething");
    }
}
