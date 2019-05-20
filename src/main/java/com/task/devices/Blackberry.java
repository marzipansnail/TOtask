package com.task.devices;

import com.task.IDevice;

public class Blackberry implements IDevice {
    public void getMessage(String msg) {
        System.out.println("Blackberry got message:\n");
        System.out.println(msg);
    }

    public void chooseGame() {

    }
}
