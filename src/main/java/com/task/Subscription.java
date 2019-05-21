package com.task;

import java.util.Date;

class Subscription
{
    private IGame game;
    private Device device;
    private Date lastUpdate;
    public Subscription (IGame game, Device device) {
        this.game = game;
        this.device = device;
        this.lastUpdate = new Date();
    }

    public void notifyDevice() {
        if (!isUpToDate())
        {
            device.getMessage(game.getLatestResults());
            this.lastUpdate = new Date();
        }
    }

    public IGame getGame() {
        return game;
    }

    public Device getDevice() {
        return device;
    }

    private boolean isUpToDate() {
        return lastUpdate.after(this.game.getLatestResultsDate());
    }
}
