package basic.questResolve;

public class RefEx1Resolve {
    // 문제: 상품 주문 시스템 개발 - 리팩토링
    //문제 설명
    //앞서 만들었던 다음 클래스에 있는 "상품 주문 시스템"을 리팩토링 하자.
    //당신은 온라인 상점의 주문 관리 시스템을 만들려고 한다.
    public static void main(String[] args) {
        // 여러 상품의 주문 정보를 담는 배열 생성
        ProductOrder[] order = new ProductOrder[3];
        // createOrder()를 여러번 사용해서 상품 주문 정보들을 생성하고 배열에 저장
        order[0] = createOrder("두부", 2000, 2);
        order[1] = createOrder("김치", 5000, 1);
        order[2] = createOrder("콜라", 1500, 2);
        // printOrders()를 사용해서 상품 주문 정보 출력
        printOrders(order);
        // getTotalAmount()를 사용해서 총 결제 금액 계산
        int sum = getTotalAmount(order);
        System.out.println("총 결제 금액: " + sum);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        //배열을 받아서 배열에 들어있는 전체 ProductOrder 의 상품명, 가격, 수량을 출력합니다.
        for (ProductOrder o : orders) {
            System.out.println("상품명: " + o.productName + ", 가격: " + o.price + ", 수량: " + o.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        //배열을 받아서 배열에 들어있는 전체 ProductOrder 의 총 결제 금액을 계산하고, 계산 결과를 반환합니
        int sum = 0;
        for (ProductOrder o : orders) {
            sum += o.price * o.quantity;
        }
        return sum;
    }
    //출력 예시 ```
    //상품명: 두부, 가격: 2000, 수량: 2
    //상품명: 김치, 가격: 5000, 수량: 1
    //상품명: 콜라, 가격: 1500, 수량: 2
    //총 결제 금액: 12000
}
