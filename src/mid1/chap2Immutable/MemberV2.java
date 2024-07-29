package mid1.chap2Immutable;

public class MemberV2 {
    private String name;

    private ImmutableAddress immutableAddress;

    public MemberV2(String name, ImmutableAddress immutableAddress) {
        this.name = name;
        this.immutableAddress = immutableAddress;
    }

    public void setAddress(ImmutableAddress immutableAddress) {
        this.immutableAddress = immutableAddress;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "MemberV2{" +
                "name='" + name + '\'' +
                ", immutableAddress=" + immutableAddress +
                '}';
    }
}
