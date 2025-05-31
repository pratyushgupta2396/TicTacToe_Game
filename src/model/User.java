package model;

import java.util.List;

public class User {
    int id;
    String name;
    List<Game> games;

    public User(int id, String name, List<Game> games) {
        this.id = id;
        this.name = name;
        this.games = games;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}