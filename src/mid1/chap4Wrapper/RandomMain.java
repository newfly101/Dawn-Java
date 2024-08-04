package mid1.chap4Wrapper;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random rand = new Random();

        int randInt = rand.nextInt();
        System.out.println("randInt = " + randInt);

        double randDouble = rand.nextDouble(); // 0.0d ~ 1.0d
        System.out.println("randDouble = " + randDouble);

        boolean randBoolean = rand.nextBoolean();
        System.out.println("randBoolean = " + randBoolean);

        // 범위 조회
        int randRange = rand.nextInt(10) ; // 0~ 9까지 출력
        System.out.println("randRange(0~9) = " + randRange);
        randRange = rand.nextInt(10) + 1; // 1~10까지 출력
        System.out.println("randRange(1~10) = " + randRange);

    }
}
