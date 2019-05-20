package com.task;

import java.util.Date;

public class Subscription {
    private IGame game;
    private IDevice device;
    private Date lastUpdate;


    public void notifyDevice(){
        if (!isUpToDate()) {
            device.getMessage(game.getLatestResults());
            this.lastUpdate = new Date();
        }
    }

    public IGame getGame() {
        return game;
    }

    public IDevice getDevice() {
        return device;
    }

    private boolean isUpToDate() {
        return lastUpdate.after(this.game.getLatestResultsDate());
    }
}
