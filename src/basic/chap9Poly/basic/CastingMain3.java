package basic.chap9Poly.basic;

public class CastingMain3 {
    public static void main(String[] args) {
        // 업 캐스팅
        Child child = new Child();
        Parent parent1 = (Parent) child; // 업 캐스팅은 생략 가능
        Parent parent2 = child; // 업캐스팅 생략

        parent1.parentMethod();
        parent2.parentMethod();
    }
}
