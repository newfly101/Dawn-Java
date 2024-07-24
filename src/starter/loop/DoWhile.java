package starter.loop;

public class DoWhile {
    public static void main(String[] args) {
        int i = 10;
        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        }
        while (i < 3);
        // do 에 의해서 한번 실행하고 종료 된다.
    }
}
