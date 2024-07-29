package mid1.chap2Immutable;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress iAddress = new ImmutableAddress("서울");
        MemberV2 mem1 = new MemberV2("회원A",iAddress);
        MemberV2 mem2 = new MemberV2("회원B",iAddress);

        // 회원A, 회원B의 처음 주소는 모두 서울
        System.out.println("memberA = " + mem1);
        System.out.println("memberB = " + mem2);

        // 회원B의 주소를 부산으로 변경
        mem2.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산 -> memberB.address");
        System.out.println("memberA = " + mem1);
        System.out.println("memberB = " + mem2);
    }
}
