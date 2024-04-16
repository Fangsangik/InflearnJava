package chap25.practice1;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};
        double sum = 0;

        for (String s : array) {
            double doubleArray = Double.parseDouble(s);

            for (int i = 0; i < doubleArray; i++) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
