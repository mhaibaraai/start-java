/*
 * @Author yixuanmiao
 * @Date 2025/08/12 13:23
 */

package com.movk.innerclass;

public class Test2 {

    public static void main(String[] args) {
        // 使用匿名内部类实现 Cry 接口
        startCry(new Cry() {
            @Override
            public void cry() {
                System.out.println("🐱猫在叫");
            }
        });

        // 使用 Lambda 表达式实现 Cry 接口
        Cry lambdaCry = () -> System.out.println("🐶狗在叫");
        startCry(lambdaCry);
    }

    public static void startCry (Cry cry) {
        cry.cry();
    }
}

@FunctionalInterface
interface Cry {
    void cry();
}