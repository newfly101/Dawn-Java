package Starter.loop;

public class NestedFor {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("-> 내부 for문 실행 ["+ i + ", " + j + "]");
            }
            System.out.println();
        }
    }
}
