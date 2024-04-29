package chap18.chap16.math;

public class MathUtils {

    public static int sum(int[] val) {
        int rst = 0;
        for (int i = 0; i < val.length; i++) {
            rst += val[i];
        }
        return rst;
    }

    public static double average(int[] val) {
        double rst = 0;
        for (int i = 0; i < val.length; i++) {
            rst += val[i] / val.length;
        }

        return rst;
    }

    public static int min(int[] val) {
        int min = val[0];
        for (int i = 0; i < val.length; i++) {
            if (val[i] < min) {
                min = val[i];
            }
        }
        return min;
    }

    public static int max(int[] val) {
        int max = val[0];
        for (int i = 0; i < val.length; i++) {
            if (val[i] > max) {
                max = val[i];
            }
        }
        return max;
    }
}
