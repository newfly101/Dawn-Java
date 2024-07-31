package mid1.questResolve.string;

public class StringEx11Resolve {
    // 문제11 - reverse()
    //문제 설명
    //str 문자열을 반대로 뒤집어라.
    //StringBuilder 에 있는 reverse() 를 사용해라.
    public static void main(String[] args) {
        String str = "Hello Java";
        // 코드 작성
        String string = new StringBuilder(str).reverse().toString();

        System.out.println(string);
    }
    //실행 결과 ```
    //avaJ olleH
}
