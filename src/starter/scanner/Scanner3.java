package starter.scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        /*
        * 사용자가 입력한 문자열을 그대로 출력하는 예제
        * exit 입력시 프로그램 종료
        * 프로그램을 반복해서 실행
        */

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("문자열을 입력하세요 : ");
            String str = sc.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
        }

    }
}
