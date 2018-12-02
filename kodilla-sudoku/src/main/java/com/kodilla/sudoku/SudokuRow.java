package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuRow {
    private List<SudokuElement> sudokuElements = new ArrayList<>();

    public SudokuRow() {
        for(int i = 0; i < 9; i++) {
            sudokuElements.add(new SudokuElement());
        }
    }

    public List<SudokuElement> getSudokuElements() {
        return sudokuElements;
    }

    @Override
    public String toString() {
        String s = "|";
        for(SudokuElement element : sudokuElements) {
            s += " " + element + " |";
        }
        return s;
    }
}
