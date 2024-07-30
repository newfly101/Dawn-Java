package mid1.chap3String;

public class StringImmutable1 {
    public static void main(String[] args) {
        String str = "hello";
        str.concat(" java");
        System.out.println("str = " + str);
        // String 은 불변 객체라 변경이 필요한 경우 새로 생성해줘야 한다.

        String str2 = str.concat(" java");
        System.out.println("str2 = " + str2);
    }
}
