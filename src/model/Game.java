package model;

import java.time.LocalDateTime;

public class Game {
    int id;
    LocalDateTime startingTime;
    User user1;
    User user2;
    User winner;
    Board board;



    public Game(int id, LocalDateTime startingTime, User user1, User user2, Board board) {
        this.id = id;
        this.startingTime = startingTime;
        this.user1 = user1;
        this.user2 = user2;
        this.board = board;
    }

    public Game() {
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getStartingTime() {
        return startingTime;
    }

    public User getWinner() {
        return winner;
    }

    public void setWinner(User winner) {
        this.winner = winner;
    }

    public void setStartingTime(LocalDateTime startingTime) {
        this.startingTime = startingTime;
    }

    public User getUser1() {
        return user1;
    }

    public void setUser1(User user1) {
        this.user1 = user1;
    }

    public User getUser2() {
        return user2;
    }

    public void setUser2(User user2) {
        this.user2 = user2;
    }
}