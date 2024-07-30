package mid1.chap3String;

public class ValueAdder {
    private int value;

    public ValueAdder add(int value) {
        this.value += value;
        return this;
    }

    public int getValue() {
        return value;
    }
}
