package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> sudokuRows = new ArrayList<>();


    public SudokuBoard() {
        for(int i = 0; i < 9; i++) {
            sudokuRows.add(new SudokuRow());
        }
    }

    public Integer getValue(int row, int col) {
        return sudokuRows.get(row).getSudokuElements().get(col).getValue();
    }

    public List<Integer> getAllowed(int row, int col) {
        return sudokuRows.get(row).getSudokuElements().get(col).getAllowedValues();
    }


    public void setValue(int row, int col, Integer value) {
        sudokuRows.get(row).getSudokuElements().get(col).setValue(value);
    }

    @Override
    public String toString() {
        String s = "";
        for(SudokuRow row : sudokuRows) {
            s += row + "\n";
        }
        return s;
    }
}
