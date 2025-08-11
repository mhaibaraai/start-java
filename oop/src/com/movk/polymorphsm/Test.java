/**
 * Copyright © 2025 Yixuan Miao
 */

package com.movk.polymorphsm;

public class Test {
    public static void main(String[] args) {
        // 创建一个 Tortoise 对象
        Tortoise tortoise = new Tortoise();
        // 调用 makeSound 方法
        tortoise.makeSound(); // 输出：Tortoise 会叫：龟龟龟

        // 创建一个 Rabbit 对象
        Rabbit rabbit = new Rabbit();
        // 调用 makeSound 方法
        rabbit.makeSound(); // 输出：Rabbit 会叫：兔兔兔

        // 多态
        Animals animal1 = new Tortoise("小乌龟");
        animal1.makeSound(); // 输出：小乌龟 会叫：龟龟龟

        Animals animal2 = new Rabbit("小兔子");
        animal2.makeSound(); // 输出：小兔子 会叫：兔兔兔

        // 调用 run 方法
        run(tortoise); // 输出：Running with Tortoise: 小乌龟
        run(rabbit); // 输出：Running with Rabbit: 小兔子
    }

    public static void run(Animals animal) {
        System.out.println("Running with Rabbit: " + animal.getName());
    }
}
