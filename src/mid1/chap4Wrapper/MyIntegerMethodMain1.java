package mid1.chap4Wrapper;

public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger mInteger = new MyInteger(10);
        int i1 = mInteger.compareTo(5);
        int i2 = mInteger.compareTo(10);
        int i3 = mInteger.compareTo(20);
        System.out.println("i1 = " + i1);
        System.out.println("i2 = " + i2);
        System.out.println("i3 = " + i3);
    }
}
