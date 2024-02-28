package chap4.practice1;

public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 7.1;

        if (rating <= 9){
            System.out.println("어바웃 타입을 추천");
        }

        if (rating <= 8){
            System.out.println("토이스토리를 추천");
        }

        if (rating <= 7){
            System.out.println("고질라 추천");
        }
    }
}
