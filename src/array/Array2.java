package array;

public class Array2 {
    public static void main(String[] args) {
        // 학생의 점수를 출력하는 간단한 프로그램
        int[] students; // 배열 선언
        students = new int[]{90,80,70,60,50}; // 배열 초기화
//        students = {90,80,70,60,50}; // 오류

        int[] students2 = {90,80,70,60,50}; // 배열 선언 + 초기화

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생"+(i+1)+": " + students[i]);
        }
    }
}
