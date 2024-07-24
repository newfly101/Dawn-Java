package basic.chap4Construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        // this : instance 자신의 참조값을 가리킴
    }
}
