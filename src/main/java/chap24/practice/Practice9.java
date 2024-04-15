package chap24.practice;

public class Practice9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String[] arr = email.split("@");

        String id = arr[0];
        String domain = arr[1];

        System.out.println("id = " + id);
        System.out.println("domain = " + domain);
    }
}
