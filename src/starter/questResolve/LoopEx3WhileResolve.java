package starter.questResolve;

public class LoopEx3WhileResolve {
    public static void main(String[] args) {
        int sum = 0;
        int max = 13;
        int i = 1;
        while (i <= max) {
            sum = sum + i;
            System.out.println(sum);
            i++;
        }
    }
}
