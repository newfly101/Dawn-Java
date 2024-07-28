package mid1.chap1Object.lang;

public class ObjectPolyEx1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        Object obj = new Object();
        Object[] obj2 = {dog, cat};

        size(obj2);

    }
    private static void action(Object obj) {
        if (obj instanceof Dog dog) {
            dog.sound();
        } else if (obj instanceof Cat cat) {
            cat.sound();
        }
    }
    private static void size(Object[] obj) {
        System.out.println("전달된 객체의 수는: " + obj.length);
    }
}
