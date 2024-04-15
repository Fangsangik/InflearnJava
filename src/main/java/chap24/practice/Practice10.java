package chap24.practice;

public class Practice10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] spiltFruits = fruits.split(",");
        for (String spiltFruit : spiltFruits) {
            System.out.println("spiltFruit = " + spiltFruit);
        }

        String joinFruits = String.join("-", spiltFruits);
        System.out.println("joinFruits = " + joinFruits);
    }
}
