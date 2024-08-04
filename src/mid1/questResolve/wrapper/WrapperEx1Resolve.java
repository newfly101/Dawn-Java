package mid1.questResolve.wrapper;

public class WrapperEx1Resolve {
    // 문제1 - parseInt()
    //문자로 입력된 str1 , str2 두 수의 합을 구하자.
     public static void main(String[] args) {
     String str1 = "10";
     String str2 = "20";
     // 코드 작성
         System.out.println("두 수의 합: " + sumString(str1, str2));
     }
     static int sumString(String str1, String str2) {
         int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
         return sum;
     }
    //두 수의 합: 30
}
