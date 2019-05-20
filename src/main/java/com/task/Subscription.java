package com.task;

import java.util.Date;

public class Subscription {
    private IGame game;
    private IDevice device;
    private Date lastUpdate;


    public void notifyDevice(){
        if(isUpToDate()){
            System.out.println("Device got his message");
        }else{
            device.send();
        }
    }

    public IGame getGame() {
        return game;
    }

    public IDevice getDevice() {
        return device;
    }

    private boolean isUpToDate() {
        return false;
    }
}
