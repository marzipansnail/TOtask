package com.task.devices;

import com.task.IDevice;

public class AndroidDevice implements IDevice {
    public void getMessage(String msg) {
        System.out.println("Android got message:\n");
        System.out.println(msg);
    }
    public void chooseGame() {

    }
}
