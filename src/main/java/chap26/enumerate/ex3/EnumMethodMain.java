package chap26.enumerate.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {

        //모든 Enum 변환
        Grade[] grades = Grade.values();
        System.out.println("grades = " + Arrays.toString(grades));
        for (Grade grade : grades) {
            System.out.println("name= " + grade.name() + " ordinal= " + grade.ordinal());
        }

        //String -> Enum 변환
        String input = "GOLD";
        Grade grade = Grade.valueOf(input);
        System.out.println("grade = " + grade);
    }
}
