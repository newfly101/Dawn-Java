package Starter.condition;

public class ConditionSwitch14 {
    public static void main(String[] args) {
        // 자바 14에서 새로운 switch문이 정식 도입됨
        int grade = 2;
        int coupon = switch (grade) {
            case 1 -> 1000;
            case 2 -> 2000;
            case 3 -> 3000;
            default -> 500;
        };
        System.out.println("발급받은 쿠폰 : "+ coupon);
    }
}
