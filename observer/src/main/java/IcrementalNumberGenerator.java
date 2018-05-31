public class IcrementalNumberGenerator extends NumberGenerator {
    private int end;
    private int step;
    private int number;
    public IcrementalNumberGenerator(int start, int end, int step) {
        this.number = start;
        this.end = end;
        this.step = step;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void execute() {
        while (number < end) {
            notifyObservers();
            number += step;
        }
    }
}
