package mid1.chap2Immutable;

public class MutableMain {
    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);
        System.out.println("obj = " + obj.getValue());
    }
}
