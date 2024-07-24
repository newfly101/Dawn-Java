package basic.chap4Construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;


    // 메서드 오버로딩 처럼 매개변수만 다르게 해서 여러 생성자 제공
    MemberConstruct(String name, int age) {
        this(name, age, 50); // this()는 생성자 코드 첫줄에만 작성 가능
        // MemberConstruct(String name, int age) 호출-> MemberConstruct(String name, int age, int grade)
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name="+name +", age="+age+", grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    } // 생성자는 반환타입이 없음
}
