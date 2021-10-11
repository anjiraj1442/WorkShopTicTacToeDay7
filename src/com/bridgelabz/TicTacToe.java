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
    public static char userChoice;

    public static void main(String[] args) {
        System.out.println("Welcome to Tic-Tac-Toe Game");
        createBoard();
        chooseChoice();
        currentBoard();
        selectIndex();
    }
    //create a method is board
    public static void createBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }
    //create a method is current board

    private static void currentBoard() {
        for (int i = 1; i < 10; i++) {
            if (board[i] != 'X' && board[i] != 'O') {
                board[i] = (char) (i + 'O');
            }
        }
        showBoard();
    }
    //create a method is show board
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
    //create a method is choosechoice
    static void chooseChoice() {
        System.out.println("Choose X or O");
        userChoice = sc.next().charAt(0);
        if (userChoice == 'O') {
            System.out.println("Player choice is " + userChoice);
            System.out.println("Computer choice is X");
        } else if (userChoice == 'X') {
            System.out.println("Player choice is " + userChoice);
            System.out.println("Computer choice is O");
        } else {
            System.out.println("Entered wrong input");
            chooseChoice();
        }
    }
    //create a method is select index
    public static void selectIndex() {
        System.out.print("Select number between 1 and 9 :");
        int indexNumber = sc.nextInt();
        for (int i = 0; i < board.length; i++) {
            if ((i) == indexNumber) {
                board[i] = userChoice;
            }
        }
        currentBoard();
    }
}

