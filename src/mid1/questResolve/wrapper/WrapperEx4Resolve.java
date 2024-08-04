package mid1.questResolve.wrapper;

public class WrapperEx4Resolve {
    // 문제4 - 오토 박싱, 오토 언박싱
    //문제 설명
    //String str 을 Integer 로 변환해서 출력해라.
    //Integer 를 int 로 변환해서 출력해라.
    //int 를 Integer 로 변환해서 출력해라.
    //오토 박싱, 오토 언박싱을 사용해서 변환해야 한다.
     public static void main(String[] args) {
     String str = "100";
     // 코드 작성
         Integer integer1 = Integer.valueOf(str);
         System.out.println("integer1 = " + integer1);
         int intValue = integer1;
         System.out.println("intValue = " + intValue);
         Integer integer2 = intValue;
         System.out.println("integer2 = " + integer2);
     }
    //integer1 = 100
    //intValue = 100
    //integer2 = 100
}
