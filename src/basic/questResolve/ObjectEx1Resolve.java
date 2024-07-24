package basic.questResolve;

public class ObjectEx1Resolve {
    //문제1 - 절차 지향 직사각형 프로그램을 객체 지향으로 변경하기
    //다음은 직사각형의 넓이(Area), 둘레 길이(Perimeter), 정사각형 여부(square)를 구하는 프로그램이다.
    //절차 지향 프로그래밍 방식으로 되어 있는 코드를 객체 지향 프로그래밍 방식으로 변경해라.
    //Rectangle 클래스를 만들어라.
    //RectangleOopMain 에 해당 클래스를 사용하는 main() 코드를 만들어라.
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.width = 5;
        r.height = 8;
        int area = r.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = r.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = r.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
    //}
    //```
    //실행 결과 ```
    //넓이: 40
    //둘레 길이: 26
    //정사각형 여부: false
}
