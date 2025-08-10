package com.movk.finaldemo;

public class Test {
    /**
     * 变量有哪些:
     *      - 成员变量
     *          - 实例变量
     *          - 静态变量
     *      - 局部变量
     */

    // final 修饰变量，变量的值不能被修改
    public static final String CONSTANT_VALUE = "This is a constant value.";
    public static void main(String[] args) {
        // 输出常量值
        System.out.println(CONSTANT_VALUE);

        // 尝试修改 final 变量（会报错）
        // CONSTANT_VALUE = "Trying to change a constant value."; // 编译错误

        // 创建 FinalClass 的实例
        FinalClass finalClassInstance = new FinalClass();

        // 调用父类的 final 方法
        ParentClass parent = new ChildClass();
        parent.finalMethod();
    }
}

// final 修饰类，类不能被继承
final class FinalClass {}
// final class FinalClass2 extends FinalClass {}

// final 修饰方法，方法不能被重写
class ParentClass {
    public final void finalMethod() {
        System.out.println("This is a final method.");
    }
}
class ChildClass extends ParentClass {
//    @Override
//     public void finalMethod() { // 不能重写父类的 final 方法
//         System.out.println("Trying to override a final method.");
//     }
}