package mid1.questResolve.string;

public class StringEx2Resolve {
    // 문제2 - length()
    //문제 설명
    //length() 를 사용해서 arr 배열에 들어있는 모든 문자열의 길이 합을 구해라.
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // 코드 작성
        int sum = 0;
        for (String a : arr) {
            System.out.println(a + ":" + a.length());
            sum += a.length();
        }
            System.out.println("sum = " + sum);
    }
    //실행 결과 ```
    //hello:5
    //java:4
    //jvm:3
    //spring:6
    //jpa:3
    //sum = 21
}
