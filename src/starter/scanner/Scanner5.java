package starter.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
        /* 사용자가 입력한 숫자의 모든 합을 계산하는 문제 */
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        while (true) {
            try {
                System.out.print("숫자를 입력(0입력시 종료) : ");
                int num = sc.nextInt();
                if (num == 0) break; // 0입력시 종료
                sum += num;
            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력하세요!");
                sc.next();
            }
        }
        System.out.println("입력한 모든 정수의 합 : " + sum);
    }
}
