package basic.chap9Poly.basic;

public class CastingMain {
    public static void main(String[] args) {
        // 다운 캐스팅 : 부모 타입을 잠시 자식 타입으로 변경
        System.out.println("Parent -> child");
        Parent poly = new Child();
//        poly.parentMethod();

        Child child = (Child) poly;
        child.childMethod();
    }
}
