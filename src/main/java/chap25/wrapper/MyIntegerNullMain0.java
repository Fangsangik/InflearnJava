package chap25.wrapper;

public class MyIntegerNullMain0 {
    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findVal(intArr, -1));
        System.out.println(findVal(intArr, 0));
        System.out.println(findVal(intArr, 1));
        System.out.println(findVal(intArr, 100));

    }

    public static int findVal(int[] intArr, int target){
        for (int val : intArr) {
            if (val == target){
                return val;
            }
        }
        return -1;
    }
}
