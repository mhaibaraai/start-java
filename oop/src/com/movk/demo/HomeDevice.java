/**
 * Copyright © 2025 Yixuan Miao
 */

package com.movk.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 家用设备基类
 * 其他设备（如灯光、空调、电视机）可以继承此类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeDevice implements DeviceUtil {
    private String deviceName;
    private boolean isOn;

    @Override
    public void togglePower() {
        isOn = !isOn;
        System.out.printf("设备 %s 已 %s%n", deviceName, isOn ? "开启" : "关闭");
    }
}
