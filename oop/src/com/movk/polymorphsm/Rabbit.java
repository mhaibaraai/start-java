/*
 * @Author yixuanmiao
 * @Date 2025/08/11 17:07
 */

package com.movk.polymorphsm;

public class Rabbit extends Animals {
    // Rabbit 类继承自 Animals 类，表示兔子这种动物
    public Rabbit() {
        super("Rabbit");
    }

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " 会叫：兔兔兔");
    }
}
