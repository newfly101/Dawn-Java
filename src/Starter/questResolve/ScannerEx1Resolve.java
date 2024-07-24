package Starter.questResolve;

import java.util.Scanner;

public class ScannerEx1Resolve {
    //    당신의 이름을 입력하세요:자바
//    당신의 나이를 입력하세요:30
//    당신의 이름은 자바이고, 나이는 30살입니다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("당신의 이름을 입력하세요:");
        String name = sc.nextLine();
        System.out.print("당신의 나이를 입력하세요:");
        int age = sc.nextInt();
        System.out.printf("당신의 이름은 %s이고, 나이는 %d살입니다.",name, age);
    }
}
