package scanner;

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
    }
}
