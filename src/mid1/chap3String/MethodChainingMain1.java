package mid1.chap3String;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder va = new ValueAdder();
        va.add(1);
        va.add(2);
        va.add(3);
        int result = va.getValue();
        System.out.println("result = " + result);
        
        
        // method chain 의 사용 예시
        ValueAdder va2 = new ValueAdder();
        int result2 = va2.add(1).add(2).add(3).getValue();
        System.out.println("result2 = " + result2);
    }
}
