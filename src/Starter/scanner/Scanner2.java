package Starter.scanner;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1번째 숫자: ");
        int num1 = sc.nextInt();

        System.out.print("2번째 숫자: ");
        int num2 = sc.nextInt();
        
        int sum = num1 + num2;
        System.out.println("sum = " + sum);

        if (num1 > num2) {
            System.out.println("더 큰 숫자: " + num1);
        } else if (num2 > num1) {
            System.out.println("더 큰 숫자: " + num2);
        } else {
            System.out.println("두 숫자는 같습니다.");
        }
    }
}
