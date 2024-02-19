package chap8.practice;

public class Practice01 {
    public static void main(String[] args) {
        int[] students = {90,80,70,60,50};

        int total = 0;
        double avg = 0;
        for (int i = 0; i < students.length; i++) {
            total += students[i];
        }
        System.out.println(total);

        avg =(double) total / 5 ;
        System.out.println(avg);

        System.out.println();
    }
}
