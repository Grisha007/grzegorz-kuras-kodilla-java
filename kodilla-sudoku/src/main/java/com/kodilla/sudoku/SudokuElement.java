package com.kodilla.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    public static Integer EMPTY = -1;
    private Integer value;
    private List<Integer> allowedValues = new ArrayList<>();

    public SudokuElement() {
        for(int i = 1; i < 10; i++) {
            allowedValues.add(i);
        }

        value = EMPTY;
    }

    public Integer getValue() {
        return value;
    }

    public List<Integer> getAllowedValues() {
        return allowedValues;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "" + (value != EMPTY ? value : " ");
    }
}
