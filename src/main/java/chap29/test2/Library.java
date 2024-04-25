package chap29.test2;

public class Library {

    private Book[] books;
    private int bookCnt;

    public Library(int size){
        books = new Book[size];
        bookCnt = 0;
    }

    public void addBook(String title, String author){
        if (bookCnt < books.length){
            books[bookCnt++] = new Book(title, author);
        } else {
            System.out.println("공간이 없습니다.");
        }
    }

    public void showBook(){
        System.out.println("== 책 목록 출력 ==");

        for (Book book : books) {
            System.out.println("도서 재목 : " + book.title + " 저자 이름 : " + book.author);
        }
    }

   private static class Book{
       private String title;
       private String author;

       public Book(String title, String author) {
           this.title = title;
           this.author = author;
       }
   }
}
