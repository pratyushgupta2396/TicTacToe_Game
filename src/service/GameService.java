package service;

import model.Board;
import model.Game;
import model.User;
import repository.GameDb;

import java.util.Scanner;

public class GameService {

    GameDb gameDb;

    public GameService(){
        this.gameDb = new GameDb();
    }
    public Game createGame(User player1, User player2){
       return gameDb.createGame(player1, player2);
    }

    public void startGame(Game game, Scanner scn){
        User player1 = game.getUser1();
        User player2 = game.getUser2();
        Board board = game.getBoard();
        User currPlayer = player1;
        char ch = 'X';
        int count = 0;
        while(count < 9){
            System.out.println(String.format("%s this is your turn",currPlayer.getName()));
            System.out.println(String.format("%s please enter the value for row",currPlayer.getName() ));
            int rowNum = scn.nextInt();
            System.out.println(String.format("%s please enter the value for rcol",currPlayer.getName() ));
            int colNum = scn.nextInt();
            if(ch == 'X'){
                board.getRows()[rowNum]++;
                if(board.getRows()[rowNum] == 3){
                    System.out.println(String.format("%s won the game", currPlayer.getName()));
                    return;
                }
                board.getCols()[colNum]++;
                if(board.getCols()[colNum] == 3){
                    System.out.println(String.format("%s won the game", currPlayer.getName()));
                    return;
                }
                if(rowNum == colNum){
                    board.setDig(board.getDig() + 1);
                    if(board.getDig() == 3){
                        System.out.println(String.format("%s won the game", currPlayer.getName()));
                        return;
                    }
                }
                if(rowNum + colNum == 2){
                    board.setAntiDig(board.getAntiDig() + 1);
                    if(board.getAntiDig() == 3){
                        System.out.println(String.format("%s won the game", currPlayer.getName()));
                        return;
                    }
                }

            }
            if(ch == 'X'){
                ch = '0';
                currPlayer = player2;
            }else{
                ch = 'X';
                currPlayer = player1;
            }
            count++;
        }

    }
}