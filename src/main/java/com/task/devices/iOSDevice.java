package com.task.devices;

import com.task.IDevice;

public class iOSDevice implements IDevice {
    public void getMessage(String msg) {
        System.out.println("iOSDevice got message:\n");
        System.out.println(msg);
    }

    public void chooseGame() {

    }
}
