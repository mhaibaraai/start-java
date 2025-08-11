/*
 * @Author yixuanmiao
 * @Date 2025/08/11 21:15
 */

package com.movk.code;

public class Test2 {
    // 实例代码块
    {
        System.out.println("实例代码块执行");
    }

    public static void main(String[] args) {
        System.out.println("main方法执行");
        // 测试实例代码块是否在对象创建时执行
        new Test2();
        new  Test2();
        new   Test2();
    }
}
