package basic.questResolve;

public class ClassEx3Resolve {
    //문제: 상품 주문 시스템 개발
    //문제 설명
    //당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
    //먼저, 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.
    //요구 사항
    //1. ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
    //상품명 ( productName )
    //가격 ( price )
    //주문 수량 ( quantity )
    //2. ProductOrderMain 클래스 안에 main() 메서드를 포함하여, 여러 상품의 주문 정보를 배열로 관리하고, 그
    //정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자.
    //3. 출력 예시와 같도록 출력하면 된다.
    public static void main(String[] args) {

        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder order1 = new ProductOrder();
        order1.productName = "두부";
        order1.price = 2000;
        order1.quantity = 2;

        ProductOrder order2 = new ProductOrder();
        order2.productName = "김치";
        order2.price = 5000;
        order2.quantity = 1;

        ProductOrder order3 = new ProductOrder();
        order3.productName = "콜라";
        order3.price = 1500;
        order3.quantity = 2;

        // 상품 주문 정보를 `ProductOrder` 타입의 변수로 받아 저장
        ProductOrder[] orders = new ProductOrder[]{order1, order2, order3};
        // 상품 주문 정보와 최종 금액 출력
        int sum = 0;
        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
            sum += o.price * o.quantity;
        }
        System.out.println("총 결제 금액: " + sum);
    }
    //```
    //출력 예시 ```
    //상품명: 두부, 가격: 2000, 수량: 2
    //상품명: 김치, 가격: 5000, 수량: 1
    //상품명: 콜라, 가격: 1500, 수량: 2
    //총 결제 금액: 12000
}
