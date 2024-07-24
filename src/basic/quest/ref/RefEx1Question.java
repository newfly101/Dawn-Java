package basic.quest.ref;

public class RefEx1Question {
    // 문제: 상품 주문 시스템 개발 - 리팩토링
    //문제 설명
    //앞서 만들었던 다음 클래스에 있는 "상품 주문 시스템"을 리팩토링 하자.
    //class1.ex.ProductOrderMain
    //당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
    //먼저, 상품 주문 정보를 담을 수 있는 ProductOrder 클래스를 만들어보자.
    //요구 사항
    //ProductOrder 클래스는 다음과 같은 멤버 변수를 포함해야 한다.
    //상품명 ( productName )
    //가격 ( price )
    //주문 수량 ( quantity )
    //예시 코드 구조 ```java
    //package ref.ex;
    //public class ProductOrder {
    // String productName;
    // int price;
    // int quantity;
    //}
    //```
    //이 코드도 ref.ex 패키지에 새로 만들어야 한다.
    //다음으로 ref.ex.ProductOrderMain2 클래스 안에 main() 메서드를 포함하여, 여러 상품의 주문 정보를 배열
    //로 관리하고, 그 정보들을 출력하고, 최종 결제 금액을 계산하여 출력하자. 이 클래스에서는 다음과 같은 메서드를 포함
    //해야 합니다:
    //static ProductOrder createOrder(String productName, int price, int quantity)
    //ProductOrder 를 생성하고 매개변수로 초기값을 설정합니다. 마지막으로 생성한 ProductOrder 를
    //반환합니다.
    //static void printOrders(ProductOrder[] orders)
    //배열을 받아서 배열에 들어있는 전체 ProductOrder 의 상품명, 가격, 수량을 출력합니다.
    //static int getTotalAmount(ProductOrder[] orders)
    //배열을 받아서 배열에 들어있는 전체 ProductOrder 의 총 결제 금액을 계산하고, 계산 결과를 반환합니
    //다.
    //예시 코드 구조 ```java
    //package ref.ex;
    //public class ProductOrderMain2 {
    // public static void main(String[] args) {
    // // 여러 상품의 주문 정보를 담는 배열 생성
    // // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
    // // printOrders()를 사용해서 상품 주문 정보 출력
    // // getTotalAmount()를 사용해서 총 결제 금액 계산
    // // 총 결제 금액 출력
    // }
    //}
    //```
    //출력 예시 ```
    //상품명: 두부, 가격: 2000, 수량: 2
    //상품명: 김치, 가격: 5000, 수량: 1
    //상품명: 콜라, 가격: 1500, 수량: 2
    //총 결제 금액: 12000
}
