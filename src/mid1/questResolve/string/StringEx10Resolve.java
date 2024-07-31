package mid1.questResolve.string;

public class StringEx10Resolve {
    // 문제10 - split(), join()
    //문제 설명
    //split() 를 사용해서 fruits 를 분리하고, join() 을 사용해서 분리한 문자들을 하나로 합쳐라.
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        // 코드 작성
        String[] fruitsArray = fruits.split(",");
        for (String a : fruitsArray) {
            System.out.println(a);
        }
        fruits = String.join("->", fruitsArray);
        System.out.println("joinedString = " + fruits);
    }
    //실행 결과 ```
    //apple
    //banana
    //mango
    //joinedString = apple->banana->mango
}
