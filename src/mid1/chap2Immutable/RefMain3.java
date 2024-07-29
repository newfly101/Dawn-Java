package mid1.chap2Immutable;

public class RefMain3 {
    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 대입은 막을 수 없음
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b.setValue("부산"); // 값을 생성이후에 임의로 지정할 수 있는 방법이 없음
        b = new ImmutableAddress("부산");
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
