package basic.chap6Memory;

public class JavaMemoryMain1 {
    public static void main(String[] args) {
        System.out.println("main start");
        method1(10);
        System.out.println("main end");
    }
    static void method1(int x) {
        System.out.println("method1 start");
        int cal  = x * 2;
        method2(cal);
        System.out.println("method1 end");
    }
    static void method2(int x) {
        System.out.println("method2 start");
        System.out.println("method2 end");
    }
}
