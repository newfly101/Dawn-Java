package starter.quest.method;

public class MethodEx2Question {
    // 메서드 리펙토링 하기
    public static void main(String[] args) {
        String message = "Hello, world!";
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
        for (int i = 0; i < 7; i++) {
            System.out.println(message);
        }
    }
}
