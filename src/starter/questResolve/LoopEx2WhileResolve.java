package starter.questResolve;

public class LoopEx2WhileResolve {
    public static void main(String[] args) {
        int num = 1;
        while (num <= 20) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
            num++;
        }
    }
}
