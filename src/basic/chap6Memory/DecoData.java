package basic.chap6Memory;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
//        instanceValue++; // 비 static 필드 'instanceValue'은(는) static 컨텍스트에서 참조할 수 없습니다
//        instanceMethod(); // 비 static 메서드 'instanceMethod()'은(는) static 컨텍스트에서 참조할 수 없습니다
        staticValue++;
        staticMethod();
    }

    // 객체의 참조값을 직접 매개변수로 전달하면 정적 메서드도 인스턴스의 변수나 메서드를 호출
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue: " + instanceValue);
    }
    private static void staticMethod() {
        System.out.println("staticValue: " + staticValue);
    }
}
