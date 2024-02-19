package chap8;

public class ArrayDi4 {
    public static void main(String[] args) {
        int[][] arr = new int[3][3];

        int i = 1; //하나씩 순서대로 값 증가

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        //2차원 배열의 길이를 활용
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
