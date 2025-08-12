/*
 * @Author yixuanmiao
 * @Date 2025/08/12 21:41
 */

package com.movk.arraylist;

import java.util.ArrayList;

public class Test {
    // 测试ArrayList的基本功能
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        // 新增
        list.add("Hello");
        list.add("World");
        list.add("Movk");
        //查看
        System.out.println("ArrayList内容: " + list);
        // 删除
        list.remove("World");
        System.out.println("删除后内容: " + list);
        // 修改
        list.set(1, "Java");
        System.out.println("修改后内容: " + list);
    }
}
