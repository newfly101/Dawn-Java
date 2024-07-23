package questResolve;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerEx10Resolve {
//    문제 - 상품 구매
//    사용자로부터 상품 정보(상품명, 가격, 수량)를 입력받고, 이들의 총 가격을 출력하는 프로그램을 작성하세요. 사
//    용자는 여러 상품을 추가하고 결제할 수 있으며, 프로그램을 언제든지 종료할 수 있습니다.
//    사용자에게 다음 세 가지 옵션을 제공해야 합니다: 1: 상품 입력, 2: 결제, 3: 프로그램 종료. 옵션은 정수로 입력받
//    으며, 옵션을 저장하는 변수의 이름은 option 이어야 합니다.
//    상품 입력 옵션을 선택하면, 사용자에게 상품명과 가격, 수량을 입력받으세요.
//    결제 옵션을 선택하면, 총 비용을 출력하고 총 비용을 0 으로 초기화하세요. (사용자가 총 비용을 확인하고, 결제
//    를 완료했다고 가정합니다. 따라서 다음 사용자를 위해 총 비용을 다시 0 으로 초기화 해야합니다.)
//    프로그램 종료 옵션을 선택하면, "프로그램을 종료합니다."라는 메시지를 출력하고 프로그램을 종료하세요.
//    위의 세 가지 옵션 외에 다른 값을 입력하면, "올바른 옵션을 선택해주세요."라는 메시지를 출력하세요.
//    실행 결과 예시 ```
//            1: 상품 입력, 2: 결제, 3: 프로그램 종료
//1
//    상품명을 입력하세요: 스프링
//    상품의 가격을 입력하세요: 30000
//    구매 수량을 입력하세요: 1
//    상품명:스프링 가격:30000 수량:1 합계:30000
//            1: 상품 입력, 2: 결제, 3: 프로그램 종료
//1
//    상품명을 입력하세요: JPA
//    상품의 가격을 입력하세요: 40000
//    구매 수량을 입력하세요: 2
//    상품명:JPA 가격:40000 수량:2 합계:80000
//            1: 상품 입력, 2: 결제, 3: 프로그램 종료
//2
//    총 비용: 110000
//            1: 상품 입력, 2: 결제, 3: 프로그램 종료
//3
//    프로그램을 종료합니다
public static void main(String[] args) {
    int totalPrice = 0;
    while (true) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t1: 상품 입력, 2: 결제, 3: 프로그램 종료");
        try{
            int option = sc.nextInt(); // 사용자 값 입력
            String productName = "";
            int productPrice = 0;
            int productQuantity = 0;
            if (option == 1) {
                System.out.print("상품명을 입력하세요:");
                productName = sc.next();
                System.out.print("상품의 가격을 입력하세요:");
                productPrice = sc.nextInt();
                System.out.print("구매 수량을 입력하세요:");
                productQuantity = sc.nextInt();
                System.out.println("상품명:"+productName+" 가격:"+productPrice+" 수량:"+productQuantity+" 합계:"+productQuantity*productPrice);
                totalPrice += productPrice * productQuantity;
            } else if (option == 2) {
                System.out.println("총 비용: "+ totalPrice);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
                sc.next();
            }
        } catch (InputMismatchException e) {
            System.out.println("올바른 값을 선택해주세요.");
            sc.next();
        }

    }
}
}

