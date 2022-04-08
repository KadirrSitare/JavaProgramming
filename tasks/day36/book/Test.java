package day36.book;

public class Test {

    public static void main(String[] args) {

        Ebook ebook1 = new Ebook("Little Prince", "novel", "John Hopkins", 15, "Medium", 120);

        AudioBook audioBook1 = new AudioBook("You Can Do", "non-fiction", "Everyone Can", 2,120,"Brad Pitt");

        audioBook1.listen();
        ebook1.readBook();
        System.out.println(audioBook1);
        System.out.println(ebook1);





    }


}
