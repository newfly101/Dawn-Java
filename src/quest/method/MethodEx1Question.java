package quest.method;

public class MethodEx1Question {
    // 메서드 리펙토링 하기
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
        int x = 15;
        int y = 25;
        int z = 35;
        sum = x + y + z;
        average = sum / 3.0;
        System.out.println("평균값: " + average);
    }
}
