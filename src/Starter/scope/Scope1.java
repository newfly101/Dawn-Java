package Starter.scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10;
        if (m == 10) {
            int x = 20;
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        }
//        System.out.println("if x = " + x); // Starter.scope 범위 밖이라 실행x
        System.out.println("main m = " + m);
    }
}
