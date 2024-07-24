package Starter.operator;

public class Operator4 {
    // 증감 연산자
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a);

        // 전위(Prefix) 증감 연산자
        ++a;
        System.out.println("a = " + a);

        // 후위(Postfix) 증감 연산자
        a++;
        System.out.println("a = " + a);

        int b = 1;
        int c = 0;
        c = ++b;
        System.out.println("b = " + b + ", c = " + c);
        b = 1;
        c = 0;
        c = b++;
        System.out.println("b = " + b + ", c = " + c);
    }
}
