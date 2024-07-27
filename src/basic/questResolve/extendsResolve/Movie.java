package basic.questResolve.extendsResolve;

public class Movie extends Item{
    //Movie : 감독( director ), 배우( actor )
    public String director;
    public String actor;

    public Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }
    public void print() {
        super.print();
        System.out.println("- 감독:" + director + ", 배우:" + actor);
    }

    //이름:영화1, 가격:18000
    //- 감독:감독1, 배우:배우1
}
