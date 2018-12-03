package com.kodilla.sudoku;

public class SudokuGame {
    private SudokuBoard sudokuBoard = new SudokuBoard();

    public boolean resolveSudoku() {
        boolean changed = true;
        boolean allFilled = true;

        while (changed) {
            changed = false;
            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getValue(row, col) == SudokuElement.EMPTY) {
                        removeAllFromRow(row, col);
                        removeAllFromCol(row, col);
                        removeAllFromBox(row, col);
                    }
                }
            }

            for (int row = 0; row < 9; row++) {
                for (int col = 0; col < 9; col++) {
                    if (sudokuBoard.getValue(row, col) == SudokuElement.EMPTY) {
                        if (sudokuBoard.getAllowed(row, col).size() == 1) {
                            sudokuBoard.setValue(row, col, sudokuBoard.getAllowed(row, col).get(0));
                            changed = true;
                        }
                    }
                }
            }
            System.out.println(sudokuBoard);
        }

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                if (sudokuBoard.getValue(row, col) == SudokuElement.EMPTY) {
                    return false;
                }
            }
        }
        return allFilled;
    }

    private void removeAllFromRow(int row, int col) {
        for(int k = 0; k < 9; k++) {
            if(sudokuBoard.getAllowed(row, col).contains(sudokuBoard.getValue(row, k))) {
                sudokuBoard.getAllowed(row, col).remove(sudokuBoard.getValue(row, k));
            }
        }
    }

    private void removeAllFromCol(int row, int col) {
        for(int k = 0; k < 9; k++) {
            if(sudokuBoard.getAllowed(row, col).contains(sudokuBoard.getValue(k, col))) {
                sudokuBoard.getAllowed(row, col).remove(sudokuBoard.getValue(k, col));
            }
        }
    }

    private void removeAllFromBox(int row, int col) {
        int boxY = row / 3;
        int boxX = col / 3;

        for(int deltac = 0; deltac < 3; deltac++) {
            for(int deltar = 0; deltar < 3; deltar++) {
                if(sudokuBoard.getAllowed(row, col).contains(sudokuBoard.getValue(boxY * 3 + deltar, boxX * 3 + deltac))) {
                    sudokuBoard.getAllowed(row, col).remove(sudokuBoard.getValue(boxY * 3 + deltar, boxX * 3 + deltac));
                }
            }
        }
    }

    public SudokuBoard getSudokuBoard() {
        return sudokuBoard;
    }

    public void fillTestData() {
        sudokuBoard.setValue(1, 1, 7);
        sudokuBoard.setValue(2, 1, 6);
        sudokuBoard.setValue(2, 2, 1);
        sudokuBoard.setValue(3, 0, 8);
        sudokuBoard.setValue(5, 0, 7);
        sudokuBoard.setValue(6, 0, 5);
        sudokuBoard.setValue(6, 1, 9);
        sudokuBoard.setValue(7, 2, 4);
        sudokuBoard.setValue(8, 0, 6);
        sudokuBoard.setValue(0, 3, 2);
        sudokuBoard.setValue(1, 4, 9);
        sudokuBoard.setValue(2, 3, 5);
        sudokuBoard.setValue(2, 4, 8);
        sudokuBoard.setValue(3, 5, 4);
        sudokuBoard.setValue(5, 3, 8);
        sudokuBoard.setValue(6, 4, 7);
        sudokuBoard.setValue(6, 5, 8);
        sudokuBoard.setValue(7, 4, 3);
        sudokuBoard.setValue(8, 5, 1);
        sudokuBoard.setValue(0, 8, 3);
        sudokuBoard.setValue(1, 6, 2);
        sudokuBoard.setValue(2, 7, 4);
        sudokuBoard.setValue(2, 8, 9);
        sudokuBoard.setValue(3, 8, 1);
        sudokuBoard.setValue(5, 8, 4);
        sudokuBoard.setValue(6, 6, 3);
        sudokuBoard.setValue(6, 7, 1);
        sudokuBoard.setValue(7, 7, 5);
    }
}
