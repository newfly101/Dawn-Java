package questResolve;

public class ArrayEx1Resolve {
    //문제 - 배열을 사용하도록 변경
    //다음 문제를 배열을 사용해서 개선하자
    public static void main(String[] args) {
        int[] student = {90,80,70,60,50};
        int total = 0;
        for (int number : student) {
            total += number;
        }
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
    //실행 결과 예시
    //점수 총합: 350
    //점수 평균: 70.0
}
