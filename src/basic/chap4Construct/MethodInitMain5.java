package basic.chap4Construct;

public class MethodInitMain5 {
    public static void main(String[] args) {
        // 인스턴스 생성 -> 생성자 호출 : 중복 호출 제거
        MemberConstruct m1 = new MemberConstruct("user1" , 20, 100);
        MemberConstruct m2 = new MemberConstruct("user2" , 30);

        MemberConstruct[] member = {m1, m2};

        for (MemberConstruct m : member) {
            System.out.println("이름: " + m.name + ", 나이: "+ m.age + ", 성적: "+ m.grade);
        }
    }
}
