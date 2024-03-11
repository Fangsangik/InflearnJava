package chap18.extends1.access.practice;

public class ItemMain {
    public static void main(String[] args) {
        Item book = new Book("Java", 10000, "han", "12345");
        Item album = new Album("앨범1", 5000, "터진입");
        Item movie = new Movie("영화1", 10000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격 합 " + sum);
    }
}
