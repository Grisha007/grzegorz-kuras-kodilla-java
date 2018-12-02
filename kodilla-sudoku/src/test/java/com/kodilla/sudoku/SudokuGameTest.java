package com.kodilla.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuGameTest {
    @Test
    public void testResolveSudoku() {
        SudokuGame sudokuGame = new SudokuGame();
        sudokuGame.fillTestData();
        System.out.println(sudokuGame.getSudokuBoard());
        boolean result = sudokuGame.resolveSudoku();
        System.out.println(sudokuGame.getSudokuBoard());
        assertTrue(result);
    }
}