package basic.questResolve.polyResolve.ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PolyEx3Resolve {
    // 문제2: 결제 시스템 개발
    //여러분은 기대하던 결제 시스템 개발팀에 입사하게 되었다.
    //이 팀은 현재 2가지 결제 수단을 지원한다. 앞으로 5개의 결제 수단을 추가로 지원할 예정이다.
    //새로운 결제수단을 쉽게 추가할 수 있도록, 기존 코드를 리펙토링해라.
    //요구사항
    //OCP 원칙을 지키세요.
    //메서드를 포함한 모든 코드를 변경해도 됩니다. 클래스나 인터페이스를 추가해도 됩니다.
    //단 프로그램을 실행하는 PayMain0 코드는 변경하지 않고, 그대로 유지해야 합니다.
    //리펙토링 후에도 실행 결과는 기존과 같아야 합니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();
        while (true) {
            try {
                // 사용자 입력 추가
                System.out.print("결제 수단을 입력하세요: ");
                String option = sc.nextLine();
                if (option.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }
                System.out.print("결제 금액을 입력하세요: ");
                int amount = sc.nextInt();
                sc.nextLine(); //  입력 버퍼 초기화

                payService.processPay(option, amount);

            } catch (InputMismatchException e) {
                System.out.println("잘못 입력했습니다. 처음으로 돌아갑니다");
                continue;
            }
        }


    }
    //실행 결과 ex3
    //결제 수단을 입력하세요:kakao
    //결제 금액을 입력하세요:5000
    //결제를 시작합니다: option=kakao, amount=5000
    //카카오페이 시스템과 연결합니다.
    //5000원 결제를 시도합니다.
    //결제가 성공했습니다.
    //결제 수단을 입력하세요:exit
    //프로그램을 종료합니다.


    //결제를 시작합니다: option=kakao, amount=5000
    //카카오페이 시스템과 연결합니다.
    //5000원 결제를 시도합니다.
    //결제가 성공했습니다.
    //결제를 시작합니다: option=naver, amount=10000
    //네이버페이 시스템과 연결합니다.
    //10000원 결제를 시도합니다.
    //결제가 성공했습니다.
    //결제를 시작합니다: option=bad, amount=15000
    //결제 수단이 없습니다.
    //결제가 실패했습니다
}
