package basic.questResolve.extendsResolve;

public class Item {
    //공통 속성: name , price
    protected String name;
    protected int price;
    protected Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void print(){
        System.out.println("이름:"+name+", 가격:"+price);
    }
    public int getPrice() {
        return price;
    }
}
