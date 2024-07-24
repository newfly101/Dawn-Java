package Starter.questResolve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MethodEx4Resolve {
    // 문제 - 은행 계좌 입출금
    //다음 실행 예시를 참고해서, 사용자로부터 계속 입력을 받아 입금과 출금을 반복 수행하는 프로그램을 작성하자.
    //또한 간단한 메뉴를 표시하여 어떤 동작을 수행해야 할지 선택할 수 있게 하자
    //출금시 잔액이 부족하다면 "x원을 출금하려 했으나 잔액이 부족합니다."라고 출력해야 한다.
    public static void main(String[] args) {
        // 초기 은행 계좌
        int balance = 0;
        try{
            while (true) {
                Scanner sc = new Scanner(System.in);
                System.out.println("---------------------------------");
                System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
                System.out.println("---------------------------------");
                System.out.print("선택: ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        balance = deposit(balance, sc);
                        continue;
                    case 2:
                        balance = withdraw(balance, sc);
                        continue;
                    case 3:
                        System.out.println("현재 잔액: "+balance+"원");
                        continue;
                    case 4:
                        System.out.println("시스템을 종료합니다.");
                        break;
                    default:
                        System.out.println("메뉴에서 값을 선택해주세요.");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요.");
        }
    }
    public static int deposit(int balance, Scanner sc) {
        System.out.print("입금액을 입력하세요: ");
        int amount = sc.nextInt();
        balance += amount;
        System.out.println(amount + "원을 입금하였습니다. 현재 잔액: "+balance);
        return balance;
    }
    public static int withdraw(int balance, Scanner sc) {
        System.out.print("출금액을 입력하세요: ");
        int amount = sc.nextInt();
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원을 출금하였습니다. 현재 잔액: " +balance);
        } else {
            System.out.println(amount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
    //실행 예시 ```
    //---------------------------------
    //1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
    //---------------------------------
    //선택: 1
    //입금액을 입력하세요: 10000
    //10000원을 입금하였습니다. 현재 잔액: 10000원
    //---------------------------------
    //1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
    //---------------------------------
    //선택: 2
    //출금액을 입력하세요: 8000
    //8000원을 출금하였습니다. 현재 잔액: 2000원
    //---------------------------------
    //1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
    //---------------------------------
    //선택: 2
    //출금액을 입력하세요: 3000
    //3000원을 출금하려 했으나 잔액이 부족합니다.
    //---------------------------------
    //1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
    //---------------------------------
    //선택: 3
    //현재 잔액: 2000원
    //---------------------------------
    //1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
    //---------------------------------
    //선택: 4
    //시스템을 종료합니다.
}
