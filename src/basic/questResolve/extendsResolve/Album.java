package basic.questResolve.extendsResolve;

public class Album extends Item{
    //Album : 아티스트( artist )
    private String artist;

    //공통 속성: name , price
    public Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("- 아티스트:" + artist);
    }

    //이름:앨범1, 가격:15000
    //- 아티스트:seo
}
