package basic.chap1Class;

public class ClassStart {
    // 요구 사항:
    //1. 첫 번째 학생의 이름은 "학생1", 나이는 15, 성적은 90입니다.
    //2. 두 번째 학생의 이름은 "학생2", 나이는 16, 성적은 80입니다.
    //3. 각 학생의 정보를 다음과 같은 형식으로 출력해야 합니다: "이름: [이름] 나이: [나이] 성적: [성적]"
    //4. 변수를 사용해서 학생 정보를 저장하고 변수를 사용해서 학생 정보를 출력해야 합니다.
    //예시 출력: ```
    //이름: 학생1 나이: 15 성적: 90
    //이름: 학생2 나이: 16 성적: 80
    public static void main(String[] args) {
        String[] studentName = {"학생1", "학생2"};
//        String student1Name = "학생1";
//        String student2Name = "학생2";
        int[] studentAge = {15, 16};
//        int student1Age = 15;
//        int student2Age = 16;
        int[] studentGrade = {90, 80};
//        int student1Grade = 90;
//        int student2Grade = 80;

        for (int i = 0; i < 2; i++) {
            System.out.println("이름: "+studentName[i] + " 나이: "+studentAge[i] + " 성적: "+studentGrade[i]);
        }
//        System.out.println("이름: "+student1Name+" 나이: "+student1Age+" 성적: "+student1Grade);
//        System.out.println("이름: "+student2Name+" 나이: "+student2Age+" 성적: "+student2Grade);
    }
}
