package mid1.chap4Wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {

        // Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = Integer.valueOf(value);
        // valueOf() => 박싱

        // Wrapper -> Primitive
        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
