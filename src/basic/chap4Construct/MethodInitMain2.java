package basic.chap4Construct;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        initMember(m1, "user1", 20, 100);
        MemberInit m2 = new MemberInit();
        initMember(m2, "user2", 30, 20);

        MemberInit[] member = {m1, m2};

        for (MemberInit m : member) {
            System.out.println("이름: " + m.name + ", 나이: "+ m.age + ", 성적: "+ m.grade);
        }
    }
    static void initMember (MemberInit m, String name, int age, int grade) {
        m.name = name;
        m.age = age;
        m.grade = grade;
    }
}
