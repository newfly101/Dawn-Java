package array;

public class Array1 {
    public static void main(String[] args) {
        // 학생의 점수를 출력하는 간단한 프로그램
        int[] students = new int[5];
        System.out.println(students); // 배열 참조값 출력 : 메모리 주소 출력
        for (int i = 0; i < students.length; i++) {
            students[i] = 90 - i*10;
            System.out.println("학생"+(i+1)+": " + students[i]);
        }
    }
}
