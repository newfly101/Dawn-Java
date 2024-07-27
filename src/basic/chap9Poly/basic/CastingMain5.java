package basic.chap9Poly.basic;

public class CastingMain5 {
    public static void main(String[] args) {
        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);
    }
    private static void call(Parent p) {
        p.parentMethod();
        if (p instanceof Child) { // 서 원하는 타입으로 변경이 가능한지 확인
            System.out.println("Child 인스턴스 맞음");
            Child child = (Child) p;
            child.childMethod();
        }
    }
}
