package chap26.enumerate.practice;

public class AuthMain {
    public static void main(String[] args) {
        AuthGrade[] grades = AuthGrade.values();

        for (AuthGrade grade : grades) {
            System.out.println(grade.name() + grade.getDescription() + grade.getLevel());
        }
    }
}
