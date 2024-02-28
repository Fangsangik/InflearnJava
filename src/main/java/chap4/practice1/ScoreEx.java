package chap4.practice1;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 85;

        if (score >= 90){
            System.out.println("학점은 A");
        } else if (score >= 80){
            System.out.println("B");
        } else if (score >= 70){
            System.out.println("C");
        } else if (score >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
