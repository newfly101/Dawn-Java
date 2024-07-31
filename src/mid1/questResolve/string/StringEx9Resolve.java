package mid1.questResolve.string;

public class StringEx9Resolve {
    // 문제9 - split()
    //문제 설명
    //split() 를 사용해서 이메일의 ID 부분과 도메인 부분을 분리해라.
     public static void main(String[] args) {
     String email = "hello@example.com";
     // 코드 작성
         System.out.println("ID: " + email.split("@", 2)[0]);
         System.out.println("Domain: " + email.split("@", 2)[1]);
     }
    //ID: hello
    //Domain: example.com
}
