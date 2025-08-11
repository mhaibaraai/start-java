/*
 * @Author yixuanmiao
 * @Date 2025/08/11 17:07
 */

package com.movk.polymorphsm;

public class Animals {
    private String name;

    public Animals(String name) {
        this.name = name;
    }

    public Animals() {
        // Default constructor
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                '}';
    }

    public void makeSound() {
        System.out.println(name + " 会叫");
    }
}
