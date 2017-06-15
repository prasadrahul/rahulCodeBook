package com.prasad.hackerearth.sabrejava;

import java.util.*;

/**
 * Play TicTacToe - using 2D arrays, and a class from scratch
 *
 * @author
 * @version
 *
 * 1) Look at print board (note static X and O variables)
 * 2) Go over new code for reading in a move and checking if its occupied or not
 * 3) Write check winner code for X and then generalize it
 *
 */

public class TicTacToe
{
    // Do we need static class variables?
    // what should our instance variables be?
    private String[][] board;
    static String X = "X";
    static String O = "O";
    /**
     * Constructor for objects of class TicTacToe
     */
    public TicTacToe()
    {
        // initialize instance variables
        board = new String[3][3];
    }

    /**
     * Print out the tictactoe board
     */
    public void printBoard()
    {
        System.out.println();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == null) {
                    System.out.print("_");
                } else {
                    System.out.print(board[i][j]);
                }
                if (j < 2) {
                    System.out.print("|");
                } else {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
    /* Check if player wins.  Check right after X makes a play
     *
     */
    public Boolean checkWinner(String play) {
        int playInRow = 0;
        int playD1 = 0;
        int playD2 = 0;
        int[] playInColumn = new int[board[0].length];   // assumes square board
        for (int i = 0; i < board.length; i++) {
            playInRow = 0;
            for (int j = 0; j < board[i].length; j++) {
                if (null == board[i][j]) {
                    continue;
                }
                if (board[i][j].equals(play)) {
                    playInRow++;
                    playInColumn[j]++;
                    if (i == j) {
                        playD1++;
                    } else if (2 == i + j) {
                        playD2++;
                    }
                }

            }
            if (playInRow == 3) {
                return true;
            }
        }
        if (3 == playD1 || 3 == playD2) {
            return true;
        }
        for (int i = 0; i < playInColumn.length; i++) {
            if (playInColumn[i] == 3) {
                return true;
            }
        }
        return false;
    }
    /*
     * makeMove gets a legal coordinate for the move that is not occupied
     *    and marks it with the play string
     */
    public void makeMove(Scanner stdin, String play) {
        int r;
        int c;
        Boolean goodInput = false;
        while(!goodInput) {
            r = -1;
            c = -1;
            System.out.println ("Enter coordinates to play your " + play);
            if (stdin.hasNextInt()) {  // must be integers
                r = stdin.nextInt();
            }
            if (stdin.hasNextInt()) {
                c = stdin.nextInt();
            }
            else {
                stdin.nextLine();      // consume a line without an integer
                System.out.println("Both inputs must be integers between 0 and 2.");
                continue;
            }
            // must be in the right coordinate range
            if ((r < 0) || (r > 2) || (c < 0) || (c > 2)) {
                System.out.println("Both inputs must be integers between 0 and 2.");
                continue;
            }
            // make sure the space is not occupied
            else if (board[r][c] != null ){
                System.out.println("That location is occupied");
                continue;
            }
            else {
                board[r][c] = play;
                return;
            }
        }
        return;
    }

    public static void main(String[] args) {

        TicTacToe ttt = new TicTacToe();            // allocate a board
        Scanner stdin = new Scanner(System.in);     // read from standard in

        int moves = 0;
        System.out.println("Let's play TicTacToe -- X goes first");
        ttt.printBoard();
        while (moves < 9) {
            ttt.makeMove(stdin, ttt.X);
            moves++;
            if (moves > 4) {
                if (ttt.checkWinner(X)) {
                    System.out.println(X + " You Win!!!");
                    break;
                }
            }
            ttt.printBoard();
            ttt.makeMove(stdin, ttt.O);
            moves++;
            if (moves > 4) {
                if (ttt.checkWinner(O)) {
                    System.out.println(O + " You Win!!!");
                    break;
                }
            }
            ttt.printBoard();

        }
    }
}
