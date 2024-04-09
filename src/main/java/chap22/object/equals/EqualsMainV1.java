package chap22.object.equals;

public class EqualsMainV1 {
    public static void main(String[] args) {
        UserV1 user1 = new UserV1("id -100");
        UserV1 user2 = new UserV1("id -100");

        //둘의 참조값은 다르다.
        System.out.println("identity = " + (user1 == user2));
        System.out.println("identity = " + (user1.equals(user2)));
    }
}
