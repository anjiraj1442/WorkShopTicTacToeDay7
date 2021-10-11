package com.bridgelabz;

import java.util.Scanner;

/**
 * Tic Tac Toe Game
 *
 * @author : Anji Raj Ardula
 * @version : 16.0
 * @since : 11/10/2021
 *
 */

public class TicTacToe {
    public static Scanner sc = new Scanner(System.in);
    //create a method for board
    public static void createBoard() {
        char[] board = new char[10];
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
     // create a method for player choose O or X
    static void chooseChoice() {
        System.out.println("Choose X or O");
        char a = sc.next().charAt(0);
        if (a == 'O') {
            System.out.println("Player choice is " + a);
            System.out.println("Computer choice is X");
        } else if (a == 'X') {
            System.out.println("Player choice is " + a);
            System.out.println("Computer choice is O");
        } else {
            System.out.println("Entered wrong input");
        }

    }

    public static void main(String[] args) {
        System.out.println("Welcome To Tic Tac Toe Game");
        createBoard();
        chooseChoice();
    }
}
