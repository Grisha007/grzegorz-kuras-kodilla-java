package com.kodilla.sudoku;

import org.junit.Test;

import static org.junit.Assert.*;

public class SudokuBoardTest {
    @Test
    public void testCreateBoard() {
        SudokuBoard sudokuBoard = new SudokuBoard();
//        sudokuBoard.setValue(2, 1, 7);
//        sudokuBoard.setValue(8, 8, 5);
//        sudokuBoard.setValue(2, 2, 1);
//        sudokuBoard.setValue(3, 0, 8);
        System.out.println(sudokuBoard);
    }
}