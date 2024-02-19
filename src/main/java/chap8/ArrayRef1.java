package chap8;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] students = new int[5]; //배열 변수 선언과 동시에 배열 생성

        //변수 값 선언
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        //변수 값 사용
        System.out.println("students1 = " + students[0]);
        System.out.println("students2 = " + students[1]);
        System.out.println("students3 = " + students[2]);
        System.out.println("students4 = " + students[3]);
        System.out.println("students5 = " + students[4]);
    }
}
