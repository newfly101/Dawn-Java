package Starter.method;

public class Method3 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number); // 자동 형변환
        // int < long < double
    }
    public static void printNumber(double n) {
        System.out.println("숫자: "+ n);
    }
}
