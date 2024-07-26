package basic.questResolve;

public class MathArrayUtils {
    //다음 기능을 제공하는 배열용 수학 유틸리티 클래스( MathArrayUtils )를 만드세요.
    //MathArrayUtils 은 객체를 생성하지 않고 사용해야 합니다.
    //누군가 실수로 MathArrayUtils 의 인스턴스를 생성하지 못하게 막으세요.

    public MathArrayUtils() {}

    // : 배열의 모든 요소를 더하여 합계를 반환합니다.
    public static int sum(int[] values) {
        int total = 0;
        for (int i : values) {
            total += i;
        }
        return total;
    }
    // : 배열의 모든 요소의 평균값을 계산합니다.
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }
    // : 배열에서 최소값을 찾습니다.
    public static int min(int[] values) {
        int min = values[0];
        for (int value : values) {
            if (value < min) { min = value; }
        }
        return min;
    }
    // : 배열에서 최대값을 찾습니다.
    public static int max(int[] values) {
        int max = values[0];
        for (int value : values) {
            if (value > max) { max = value; }
        }
        return max;
    }
}
