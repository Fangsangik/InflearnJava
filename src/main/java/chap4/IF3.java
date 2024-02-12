package chap4;

public class IF3 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7){
            System.out.println("kid");
        } else if (age <= 13) {
            System.out.println("primarySchool");
        } else if ( age <= 16) {
            System.out.println("middle School");
        } else if (age <= 19) {
            System.out.println("high School");
        } else {
            System.out.println("adult");
        }
    }
}
