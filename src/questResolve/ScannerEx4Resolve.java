package questResolve;

import java.util.Scanner;

public class ScannerEx4Resolve {

//    문제 - 구구단 출력
//    사용자로부터 하나의 정수 n 을 입력받고, 입력받은 정수 n 의 구구단을 출력하는 프로그램을 작성하세
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("정수를 입력: ");
    int num = sc.nextInt();
    for (int i = 1; i < 10; i++) {
        System.out.println(num + " x " + i + " = " + num * i );
    }
}
}

