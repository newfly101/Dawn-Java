package mid1.questResolve.wrapper;

public class WrapperEx2Resolve {
    // 문제2 - parseDouble()
    //배열에 입력된 모든 숫자의 합을 구하자. 숫자는 double 형이 입력될 수 있다.
     public static void main(String[] args) {
     String[] array = {"1.5", "2.5", "3.0"};
     // 코드 작성
         System.out.println("sum = " + sumStringToDouble(array));
     }
     static double sumStringToDouble(String[] array) {
         double sum = 0.0;
         for (String s : array) {
             sum += Double.parseDouble(s);
         }
         return sum;
     }
    //실행 결과 ```
    //sum = 7.0
}
