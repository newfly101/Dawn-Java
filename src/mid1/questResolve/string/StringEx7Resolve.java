package mid1.questResolve.string;

public class StringEx7Resolve {
    // 문제7 - 공백 제거
    //문제 설명
    //문자의 양쪽 공백을 제거해라. 예) " Hello Java " "Hello Java"
     public static void main(String[] args) {
     String original = " Hello Java ";
     // 코드 작성
         System.out.println(original.substring(1, original.length()-1));
     }
    //Hello Java
}
