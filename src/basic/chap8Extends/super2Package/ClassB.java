package basic.chap8Extends.super2Package;

public class ClassB extends ClassA{
    public ClassB(int a) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB constructor a = " + a);
    }
    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB constructor a = " + a + ", b = " + b);
    }
}
