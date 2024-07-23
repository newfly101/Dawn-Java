package quest.array;

public class ArrayEx1Question {
    //문제 - 배열을 사용하도록 변경
    //다음 문제를 배열을 사용해서 개선하자
    public static void main(String[] args) {
        int student1 = 90;
        int student2 = 80;
        int student3 = 70;
        int student4 = 60;
        int student5 = 50;
        int total = student1 + student2 + student3 + student4 + student5;
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
    //실행 결과 예시
    //점수 총합: 350
    //점수 평균: 70.0
}
