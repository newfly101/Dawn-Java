package basic.chap10Poly.ex3;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        // 배열과 for문으로 중복 제거
        Animal[] animals = {new Dog(), new Cat(), new Caw()};
        for (Animal animal : animals) {
            soundAnimal(animal);
        }
    }
    // 동물이 추가되어도 변하지 않는 코드
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
