package basic.chap6Memory;

public class Data3 {
    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
