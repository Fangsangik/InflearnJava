package chap8;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        //인덱스를 직접 선언하고 배열의 루프를 직접 다 돌리고
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        //배열을 하나씩 전부다 순회
        for (int number:
             numbers) {
            System.out.println(number);
        }

        //foreach문을 사용 할 수 없는 경우
        //증가하는 index 값이 필요 -> foreach문 사용 할 수 없다.
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("i = " + i);
            System.out.println(numbers[i]);
        }
    }
}
