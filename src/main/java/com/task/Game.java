package com.task;
import java.util.Date;
import java.util.Random;

class Game implements IGame{
    public String name;
    private String latestResults = "0";
    private Date latestResultsDate;

    public Game(String name) {
        this.name = name;
        this.latestResultsDate = new Date();
    }

    public String getLatestResults()
    {
        return latestResults;
    }

    public Date getLatestResultsDate()
    {
        return latestResultsDate;
    }

    public void play() {
        Random rand = new Random();
        Integer n = rand.nextInt(20);
        latestResults = n.toString();
        latestResultsDate = new Date ();
    }
}
