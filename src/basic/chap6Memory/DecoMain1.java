package basic.chap6Memory;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "hello java";
        // 객체 생성 없이 편리하게 메서드 사용
        String deco = DecoUtil1.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
