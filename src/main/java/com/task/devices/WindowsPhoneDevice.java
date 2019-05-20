package com.task.devices;

import com.task.IDevice;

public class WindowsPhoneDevice implements IDevice {
    public void getMessage(String msg) {
        System.out.println("Windows Phone got message:\n");
        System.out.println(msg);
    }

    public void chooseGame() {

    }
}
