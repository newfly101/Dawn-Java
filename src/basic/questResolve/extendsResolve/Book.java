package basic.questResolve.extendsResolve;

public class Book extends Item{
    //Book : 저자( author ), isbn( isbn )
    private String isbn;
    private String author;

    //공통 속성: name , price
    public Book(String name, int price, String author, String isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }
    @Override
    public void print() {
        super.print();
        System.out.println("- 저자:" + author + ", isbn:" + this.isbn);
    }
}
