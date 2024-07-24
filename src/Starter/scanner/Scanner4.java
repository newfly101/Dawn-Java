package Starter.scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
        /*
        * 1숫자와 2숫자를 더해서 출력하는 프로그램
        * 1숫자와 2숫자 둘다 0일 시 프로그램 종료
        * 프로그램은 반복해서 실행
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("1숫자와 2숫자가 둘다 0일 시 프로그램 종료");
        while(true) {
            try{
                System.out.print("1숫자 입력 : ");
                int num1 = sc.nextInt();

                System.out.print("2숫자 입력 : ");
                int num2 = sc.nextInt();

                if (num1 == 0 && num2 == 0) {
                    System.out.println("종료합니다.");
                    break;
                }else {
                    System.out.println("두 숫자의 합 = "+ (num1 + num2));
                }
            } catch (InputMismatchException e) {
                System.out.println("숫자만 입력해야 합니다. 처음으로 돌아갑니다.");
                sc.next();
            }

        }
    }
}
