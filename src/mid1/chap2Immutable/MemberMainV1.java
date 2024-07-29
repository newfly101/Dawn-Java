package mid1.chap2Immutable;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 mem1 =  new MemberV1("회원A", address);
        MemberV1 mem2 =  new MemberV1("회원b", address);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + mem1);
        System.out.println("memberB = " + mem2);

        // 회원B의 주소를 부산으로 변경
        mem2.getAddress().setValue("부산");
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + mem1);
        System.out.println("memberB = " + mem2);
    }
}
