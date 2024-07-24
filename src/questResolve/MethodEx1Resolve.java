package questResolve;

public class MethodEx1Resolve {
    // 메서드 리펙토링 하기
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        avg(sum(a, b, c));
        int x = 15;
        int y = 25;
        int z = 35;
        avg(sum(x, y, z));
    }
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static void avg(int sum) {
        double average = (double) sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
