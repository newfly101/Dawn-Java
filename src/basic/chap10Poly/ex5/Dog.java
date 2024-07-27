package basic.chap10Poly.ex5;

public class Dog extends AbstractAnimal{

    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 이동");
    }
}
