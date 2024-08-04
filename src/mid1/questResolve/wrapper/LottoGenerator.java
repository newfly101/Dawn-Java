package mid1.questResolve.wrapper;

import java.util.Random;

public class LottoGenerator {
    private final Random rand = new Random();
    private int[] arr;
    private int count;

    public int[] generate() {
        arr = new int[6];
        count = 0;

        while (count < 6) {
            int num = rand.nextInt(45) + 1;
            // 배열에 추가
            if (isUnique(num)) {
                arr[count] = num;
                count++;
            }
        }
        return arr;
    }

    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (number == arr[i]) {
                return false;
            }
        }
        return true;
    }
}
