package chap24.practice;

public class Practice5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int indexNum = str.indexOf(".txt");
        System.out.println("indexNum = " + indexNum);
        String arr = str.substring(0,5);
        String endArr = str.substring(indexNum);
        System.out.println("arr = " + arr);
        System.out.println("endArr = " + endArr);
    }
}
