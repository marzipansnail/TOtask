package com.task;

import java.util.Date;

public class Game implements IGame{
    public String name;
    private String latestResults;
    private Date latestResultsDate;

    public Game(String name, String latestResults, Date latestResultsDate) {
        this.name = name;
        this.latestResults = latestResults;
        this.latestResultsDate = latestResultsDate;
    }

    public String getLatestResults() {
        return null;
    }

    public Date getLatestResultsDate() {
        return null;
    }

    public Game(String latestResults, Date latestResultsDate) {
        this.latestResults = latestResults;
        this.latestResultsDate = latestResultsDate;
    }

    public void play() {
        //tutaj dzieje sie rozgrywka i na koncu jest notify
        // z subscribemenagera
        //aktualizujemy zmienne z rozegraniem gierki
    }
}
