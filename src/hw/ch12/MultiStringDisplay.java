package hw.ch12;

// MultiStringDisplay 클래스를 구현해 보세요.
import java.util.ArrayList;
import java.util.List;

public class MultiStringDisplay extends Display {

    private List<String> strings = new ArrayList<>();
    private int columnSize = 0;

    public void add(String str) {
        strings.add(str);
        if (str.length() > columnSize) {
            columnSize = str.length();
        }
    }

    @Override
    public int getColumns() {
        return columnSize;
    }

    @Override
    public int getRows() {
        return strings.size();
    }

    @Override
    public String getRowText(int row) {
        String s = strings.get(row);
        return padRight(s, columnSize);
    }

    private String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }
}