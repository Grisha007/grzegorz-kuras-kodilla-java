import java.util.ArrayList;
import java.util.List;

public class SudokuBoard {
    private List<SudokuRow> sudokuRows = new ArrayList<>();

    public SudokuBoard() {
        for(int i = 0; i < 9; i++) {
            sudokuRows.add(new SudokuRow());
        }
    }
}
