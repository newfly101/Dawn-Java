package condition;
/*
    온라인 쇼핑몰의 할인 시스템을 개발해야 한다. 한 사용자가 어떤 상품을 구매할 때, 다양한 할인 조건에 따라 총 할인
    금액이 달라질 수 있다.
    각각의 할인 조건은 다음과 같다.
    아이템 가격이 10000원 이상일 때, 1000원 할인
    나이가 10살 이하일 때 1000원 할인
    이 할인 시스템의 핵심은 한 사용자가 동시에 여러 할인을 받을 수 있다는 점이다
 */
public class ConditionIf3 {
    public static void main(String[] args) {
        int item = 12000;
        int age = 9;
        if (item >= 10000) item -= 1000;
        if (age <= 10) item -= 1000;

        System.out.println("나이: "+ age + ", 상품가격: "+item);
    }
}
