package chap18.chap16.math;

public class MathUtilsMain {
    public static void main(String[] args) {
        int[] val = {1, 2, 3, 4, 5};

        System.out.println("sum = " + MathUtils.sum(val));
        System.out.println("average = " + MathUtils.average(val));
        System.out.println("min = " + MathUtils.min(val));
        System.out.println("max = " + MathUtils.max(val));
    }
}
