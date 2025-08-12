/*
 * @Author yixuanmiao
 * @Date 2025/08/12 16:15
 */

package com.movk.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

public class Test3 {
    /**
     * 构造器引用
     */
    public static void main(String[] args) {

//        CarFactory carFactory = new CarFactory() {
//            @Override
//            public Car create(String name) {
//                return new Car(name);
//            }
//        };

        // 使用 Lambda 表达式简化工厂方法
//        CarFactory carFactory = name -> new Car(name);

        CarFactory carFactory = Car::new;

        Car car1 = carFactory.create("Tesla");
        System.out.println(car1);


    }
}

interface CarFactory {
    Car create(String name);
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class Car {
    private String name;
}
