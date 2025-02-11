package mid1.chap1Object.lang.toString;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car = new Car("ModelY");
        Dog dog1 = new Dog("거진커", 20);
        Dog dog2 = new Dog("조리", 7);

        System.out.println("단순 toString() 출력");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println();
        System.out.println("println 내부에서 toString() 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println();
        System.out.println("Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);
    }
}
