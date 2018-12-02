package com.kodilla.sudoku;

public class SudokuRunner {
    public static void main(String[] args) {
        boolean gameFinished = false;

//        while(!gameFinished) {
//            com.kodilla.sudoku.SudokuGame theGame = new com.kodilla.sudoku.SudokuGame();
//            gameFinished = theGame.resolveSudoku();
//        }

//        com.kodilla.sudoku.SudokuElement sudokuElement = new com.kodilla.sudoku.SudokuElement();
//        System.out.println(sudokuElement);
//
//        com.kodilla.sudoku.SudokuRow sudokuRow = new com.kodilla.sudoku.SudokuRow();
//        System.out.println(sudokuRow);

        SudokuBoard sudokuBoard = new SudokuBoard();
        System.out.println(sudokuBoard);
    }
}
