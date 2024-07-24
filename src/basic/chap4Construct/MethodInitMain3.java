package basic.chap4Construct;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit m1 = new MemberInit();
        m1.initMember("user1", 20, 100);
        MemberInit m2 = new MemberInit();
        m2.initMember("user2", 30, 20);

        MemberInit[] member = {m1, m2};

        for (MemberInit m : member) {
            System.out.println("이름: " + m.name + ", 나이: "+ m.age + ", 성적: "+ m.grade);
        }
    }
}
