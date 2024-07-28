package mid1.chap1Object.lang;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object obj = new Object();
        String string = obj.toString();

        // 객체 정보를 문자열 형태로 제공
        System.out.println("toSting(): " + string);

        System.out.println("Object: " + obj);

        System.out.println("valueOf(obj): " + valueOf(obj));
    }
    public static String valueOf(Object obj) {
        return (obj == null) ? "null" : obj.toString();
    }
}
