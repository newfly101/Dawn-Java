package basic.questResolve;

public class AccessEx1Resolve {
    //문제와 풀이
    //문제 - 최대 카운터와 캡슐화
    //요구사항
    //접근 제어자를 사용해서 데이터를 캡슐화 하세요.
    //해당 클래스는 다른 패키지에서도 사용할 수 있어야 합니다.
     public static void main(String[] args) {
     MaxCounter counter = new MaxCounter(3);
     counter.increment();
     counter.increment();
     counter.increment();
     counter.increment();
     int count = counter.getCount();
     System.out.println(count);
     }
    //실행 결과
    //최대값을 초과할 수 없습니다.
    //3
}
