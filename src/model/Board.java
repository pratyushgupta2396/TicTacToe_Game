package model;


public class Board {

    char [][] board;
    int [] rows;
    int [] cols;
    int dig;
    int antiDig;

    public Board(){
        this.antiDig = 0;
        this.dig = 0;
        this.rows = new int[3];
        this.cols = new int[3];
        this.board = new char[3][3];
    }


    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

    public int[] getRows() {
        return rows;
    }

    public void setRows(int[] rows) {
        this.rows = rows;
    }

    public int[] getCols() {
        return cols;
    }

    public void setCols(int[] cols) {
        this.cols = cols;
    }

    public int getDig() {
        return dig;
    }

    public void setDig(int dig) {
        this.dig = dig;
    }

    public int getAntiDig() {
        return antiDig;
    }

    public void setAntiDig(int antiDig) {
        this.antiDig = antiDig;
    }
}