package basic.chap9Poly.basic;

public class CastingMain6 {
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
        if (p instanceof Child child) { // instanceof 를 쓰면서 동시에 변수를 선언 가능
            System.out.println("Child 인스턴스 맞음");
            child.childMethod();
        }
    }
}
