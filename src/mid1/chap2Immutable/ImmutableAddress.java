package mid1.chap2Immutable;

public class ImmutableAddress {
    private final String value;

    public ImmutableAddress(String value) {
        // 생성 시 지정된 값 외에는 변경이 불가능함
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "ImmutableAddress{" +
                "value='" + value + '\'' +
                '}';
    }
}
