package basic.chap10Poly.ex6;

public class Caw implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("음메");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
