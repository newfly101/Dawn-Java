package basic.chap4Construct;

public class MethodInitMain1 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.name = "user1";
        m1.age = 20;
        m1.grade = 100;

        MemberInit m2 = new MemberInit();
        m2.name = "user2";
        m2.age = 30;
        m2.grade = 20;

        MemberInit[] member = {m1, m2};

        for (MemberInit m : member) {
            System.out.println("이름: " + m.name + ", 나이: "+ m.age + ", 성적: "+ m.grade);
        }
    }
}
