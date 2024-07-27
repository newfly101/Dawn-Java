package basic.chap9Poly.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        // 업 캐스팅(암시적 형변환) 부모 <- 자식 객체 할당
        Parent parent1 = new Child();
        // 다운 캐스팅 (부모 클래스 타입의 객체를 자식 클래스 타입으로 변환) parent1 이 실제로 Child 클래스의 객체라 캐스팅 가능
        Child child1 = (Child) parent1;
        child1.childMethod();

        // Parent Class 객체 생성
        Parent parent2 = new Parent();
        // 다운캐스팅 시도 (parent2 는 Parent의 객체) 부모 -> 자식 casting 시도
        Child child2 = (Child) parent2;
        child2.childMethod();
    }
}
