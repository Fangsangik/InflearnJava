package chap13.practice.book;

public class Book {
    String title;
    String author;
    int page;

   Book(){
       this(" ", " ", 0);
   }

    public Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("제목 : " + title + "저자 : " + author + " page : "  + page);
    }
}
