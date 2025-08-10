package com.movk.polymorphsm;

public class Tortoise extends Animals {

    public  Tortoise() {
        super("Tortoise");
    }

    public Tortoise(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " 会叫：龟龟龟");
    }
}
