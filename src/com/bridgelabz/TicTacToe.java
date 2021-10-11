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
    public static char[] board = new char[10];

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe Game");
        createBoard();
        chooseChoice();
        showBoard();
    }
    //create a method for board
    public static void createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
    //create a method for showboard
    public static void showBoard() {
        System.out.println();
        System.out.println("     |     |     ");
        System.out.println("   " + board[1] + " |   " + board[2] + " | " + board[3] + " ");
        System.out.println("_____|_____|_____");
        System.out.println("   " + board[4] + " |   " + board[5] + " | " + board[6] + " ");
        System.out.println("_____|_____|_____");
        System.out.println("   " + board[7] + " |   " + board[8] + " | " + board[9] + " ");
        System.out.println("     |     |     ");
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
}

