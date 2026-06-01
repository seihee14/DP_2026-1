package hw.ch17;

public class EvenNumberGenerator extends NumberGenerator {
    private int number;
    private int start;
    private int end;

    public EvenNumberGenerator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        for (int i = start; i < end; i += 2) {
            this.number = i;
            notifyObservers();
        }
    }
}