package mid1.questResolve.string;

public class StringEx6Resolve {
    // 문제6 - 검색 count
    //문제 설명
    //str 에서 key 로 주어지는 문자를 찾고, 찾은 문자의 수를 출력해라.
    //indexOf() 를 반복문과 함께 풀면 된다.
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        // 코드 작성
        int count = 0;
        for (String a : str.split(" ")) {
//            System.out.println(a);
            if (key.equals(a)) {
                count++;
            }
        }
        System.out.println("count: " + count);
    }
    //}
    //```
    //실행 결과 ```
    //count = 3
}
