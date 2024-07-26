package basic.chap7Final;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final 지역 변수1
        final int data1;
        data1 = 10;

        final int data2;
        data2 = 20;

        method(10);
        System.out.println("final 변수 = " + CONST_VALUE);
    }
    static final int CONST_VALUE = 10;
    static void method(final int data) {
//        data = 20; // 오류
    }
}
