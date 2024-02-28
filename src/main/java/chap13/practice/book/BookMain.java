package chap13.practice.book;

public class BookMain {
    public static void main(String[] args) {
        Book book = new Book("Java", "Seo", 700);
        Book book2 = new Book("JPA", "kim", 700);

        book.displayInfo();
        book2.displayInfo();
    }
}
