package starter.questResolve;

import java.util.Scanner;

public class ArrayEx7Resolve {
    //문제 - 2차원 배열1
    //사용자로부터 4명 학생의 국어, 수학, 영어 점수를 입력받아 각 학생의 총점과 평균을 계산하는 프로그램을 작성하자.
    //2차원 배열을 사용하고, 실행 결과 예시를 참고하자.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("번 학생의 성적을 입력하세요:");
        int[][] score = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};
        for (int i = 0; i < score.length; i++) {
            System.out.println((i+1)+"번 학생의 성적을 입력하세요:");
            for (int j = 0; j < score[i].length; j++) {
                System.out.print(subject[j] + " 점수:");
                score[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < score.length; i++) {
            int total = 0;
            for (int j = 0; j < score[i].length; j++) {
                total += score[i][j];
            }
            double avg = (double) total / score[i].length;
            System.out.println((i+1)+"번 학생의 총점: "+total+", 평균: "+avg);
        }
    }
    //실행 결과 예시 ```
    //1번 학생의 성적을 입력하세요:
    //국어 점수:100
    //영어 점수:80
    //수학 점수:70
    //2번 학생의 성적을 입력하세요:
    //국어 점수:30
    //영어 점수:40
    //수학 점수:50
    //3번 학생의 성적을 입력하세요:
    //국어 점수:60
    //영어 점수:70
    //수학 점수:50
    //4번 학생의 성적을 입력하세요:
    //국어 점수:90
    //영어 점수:100
    //수학 점수:80
    //1번 학생의 총점: 250, 평균: 83.33333333333333
    //2번 학생의 총점: 120, 평균: 40.0
    //3번 학생의 총점: 180, 평균: 60.0
    //4번 학생의 총점: 270, 평균: 90.0
}
