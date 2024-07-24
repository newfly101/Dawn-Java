package starter.questResolve;

public class LoopEx2ForResolve {
    public static void main(String[] args) {
        for (int num = 1; num < 20; num++) {
            num++;
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
