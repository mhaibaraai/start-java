/**
 * Copyright © 2025 Yixuan Miao
 */

package com.movk.demo;

import java.util.Scanner;

public class Test {
    /**
     * 目标：某智能家居系统，可以让用户选择控制的家用设备
     * 角色：灯光、空调、电视机
     * 具备的功能：
     * 1. 开关控制
     * 2. 调节亮度/温度/音量
     */

    public static void main(String[] args) {
        // 创建设备实例
        HomeDevice light = new Light("客厅灯光", true);
        HomeDevice ac = new AirConditioner("卧室空调", false);
        HomeDevice tv = new Television("客厅电视机", false);
        HomeDevice[] devices = {light, ac, tv};
        String[] deviceNames = {"灯光", "空调", "电视机"};

        Scanner scanner = new Scanner(System.in);

        // 显示欢迎信息
        System.out.println("=== 智能家居控制系统 ===");
        System.out.println("系统已启动，当前设备状态：");
        displayAllDevicesStatus(devices, deviceNames);

        // 主控制循环
        while (true) {
            System.out.println("\n请选择操作：");
            System.out.println("0 - 控制灯光");
            System.out.println("1 - 控制空调");
            System.out.println("2 - 控制电视机");
            System.out.println("exit - 退出程序");
            System.out.print("请输入选择: ");

            String input = scanner.nextLine().trim();

            // 处理用户输入
            if ("exit".equalsIgnoreCase(input)) {
                System.out.println("感谢使用智能家居控制系统，再见！");
                break;
            }
            switch (input) {
                case "0":
                    System.out.println("当前灯光状态: " + light.isOn());
                    light.togglePower();
                    break;
                case "1":
                    System.out.println("当前空调状态: " + ac.isOn());
                    ac.togglePower();
                    break;
                case "2":
                    System.out.println("当前电视机状态: " + tv.isOn());
                    tv.togglePower();
                    break;
                default:
                    System.out.println("无效的选择，请重新输入。");
            }
        }

        scanner.close();
    }

    /**
     * 显示所有设备当前状态
     */
    private static void displayAllDevicesStatus(HomeDevice[] devices, String[] deviceNames) {
        for (int i = 0; i < devices.length; i++) {
            System.out.println(i + ". " + deviceNames[i] + ": " + devices[i].isOn());
        }
    }
}
