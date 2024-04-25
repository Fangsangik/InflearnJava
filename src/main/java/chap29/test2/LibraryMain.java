package chap29.test2;

public class LibraryMain {
    public static void main(String[] args) {
        Library library = new Library(4);
        library.addBook("책1" , "저자1");
        library.addBook("책2" , "저자2");
        library.addBook("책3" , "저자3");
        library.addBook("JPA" , "Kim");
        library.addBook("JPA" , "Kim");
        library.addBook("JPA" , "Kim");

        library.showBook();
    }
}
