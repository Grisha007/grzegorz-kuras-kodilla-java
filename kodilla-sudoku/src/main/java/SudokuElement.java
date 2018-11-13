import java.util.ArrayList;
import java.util.List;

public class SudokuElement {
    private int value;
    private List<Integer> allowedValues = new ArrayList<>();

    public SudokuElement() {
        for(int i = 1; i < 10; i++) {
            allowedValues.add(i);
        }
    }
}
