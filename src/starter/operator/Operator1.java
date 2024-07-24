package starter.operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println(sum);
        System.out.println(a-b);
        System.out.println("몫 " + a/b + ", 나머지" + a % b);

        double div = (double) a / b ;

        System.out.println("div" + div);

        System.out.println(a/0);
    }
}
