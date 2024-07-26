package basic.questResolve;

public class MemoryEx2Resolve {
    //문제2: 수학 유틸리티 클래스
    //요구사항
    //실행 코드에 static import 를 사용해도 됩니다.
     public static void main(String[] args) {
     int[] values = {1, 2, 3, 4, 5};
     System.out.println("sum=" + MathArrayUtils.sum(values));
     System.out.println("average=" + MathArrayUtils.average(values));
     System.out.println("min=" + MathArrayUtils.min(values));
     System.out.println("max=" + MathArrayUtils.max(values));
     }
    //실행 결과 ```
    //sum=15
    //average=3.0
    //min=1
    //max=5
}
