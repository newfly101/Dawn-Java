package scanner;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("문자열 입력 : ");
            String str = sc.nextLine();
            System.out.println("입력한 문자열 = " + str);

            System.out.print("정수를 입력: ");
            int intValue = sc.nextInt();
            System.out.println("입력한 정수 = " + intValue);

            System.out.print("실수를 입력: ");
            double doubleValue = sc.nextDouble();
            System.out.println("입력한 실수 = " + doubleValue);
        } catch (InputMismatchException e){
            System.out.println("형변환 오류입니다. 프로그램을 종료합니다.");
//            e.printStackTrace();
        }
    }
}
