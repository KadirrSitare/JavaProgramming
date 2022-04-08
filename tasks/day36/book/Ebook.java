package day36.book;

public class Ebook extends Book{

    public String size;
    public int pages;

    public Ebook(String title, String type, String author, double price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("You are reading \"" + title + "\" written by " + author);
    }

}
