package questResolve;

public class OperatorEx1Resolve {
    public static void main(String[] args) {
        // 문제 1. 선언하고 초기화 하기
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        // 문제 2. 합 => int sum
        int sum = num1 + num2 + num3;

        // 문제 3. 평균 => int average
        int average = sum / 3;

        System.out.println("sum = " + sum);
        System.out.println("average = " + average);
    }
}
