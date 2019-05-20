package com.task;

import java.util.ArrayList;

public class GamesManager {
    public ArrayList<IGame> games;

    public void addGame(Game game){
        this.games.add(game);
    }
}
