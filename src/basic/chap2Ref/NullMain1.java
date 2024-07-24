package basic.chap2Ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10; // data 가 null 이기 때문에 value는 인식하지 못한다.
        System.out.println("data = " + data.value);
    }
}
