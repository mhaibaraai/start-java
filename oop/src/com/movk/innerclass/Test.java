/*
 * @Author yixuanmiao
 * @Date 2025/08/12 10:50
 */

package com.movk.innerclass;

public class Test {
    public static void main(String[] args) {
        // 创建匿名内部类的实例
        Animal animal = new Animal() {
            @Override
            public void eat() {
                System.out.println("🐱猫正在吃鱼");
            }
        };

        // 调用匿名内部类的方法
        animal.eat();

        // 创建局部内部类的实例
        class LocalAnimal extends Animal {
            @Override
            public void eat() {
                System.out.println("🐶狗正在吃肉");
            }
        }

        LocalAnimal localAnimal = new LocalAnimal();
        localAnimal.eat();
    }
}
