package com.task;

import java.util.Date;

public interface IGame {
    String getLatestResults();
    Date getLatestResultsDate();
    void play();
}
