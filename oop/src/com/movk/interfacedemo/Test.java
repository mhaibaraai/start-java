/*
 * @Author yixuanmiao
 * @Date 2025/08/11 17:07
 */

package com.movk.interfacedemo;

public class Test implements B, A {

    public static void main(String[] args) {
        Test test = new Test();
        test.methodA();
        test.methodB();
        test.pluginBMethod();

        // 调用A接口的默认方法
        test.defaultMethod();

        // 调用A接口的静态方法
        A.staticMethod();

        // 输出接口中的常量
        System.out.println(A.CONSTANT_A);
    }

    @Override
    public void methodA() {
        System.out.println("这是 A 接口的方法实现。");
    }

    @Override
    public void methodB() {
        System.out.println("这是 B 接口的方法实现。");
    }

    @Override
    public void pluginBMethod() {
        System.out.println("这是 B 接口的插件方法。");
    }
}
