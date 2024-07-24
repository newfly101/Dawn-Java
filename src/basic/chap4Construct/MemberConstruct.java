package basic.chap4Construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name="+name +", age="+age+", grade="+grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    } // 생성자는 반환타입이 없음
}
