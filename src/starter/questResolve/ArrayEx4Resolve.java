package starter.questResolve;

import java.util.Scanner;

public class ArrayEx4Resolve {
    //문제 - 합계와 평균
    //사용자에게 5개의 정수를 입력받아서 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("5개의 정수를 입력하세요:");
        int[] number = new int[5];
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
            sum += number[i];
        }
        avg = (double) sum / number.length;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + avg);

    }
    //실행 결과 예시 ```
    //5개의 정수를 입력하세요:
    //1
    //2
    //3
    //4
    //5
    //입력한 정수의 합계: 15
    //입력한 정수의 평균: 3.0
}
