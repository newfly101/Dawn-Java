package mid1.chap2Immutable;

public class Address {
    // 단순히 주소를 보관하는 객체
    private String value;
    
    public Address(String value) {
        this.value = value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
