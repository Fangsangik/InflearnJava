package chap25.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
       // Random random = new Random();
        Random random = new Random(1);

        int randomInt = random.nextInt();
        System.out.println("randomInt = " + randomInt);

        double randomDouble = random.nextDouble();
        System.out.println("randomDouble = " + randomDouble);

        boolean randomBoolean = random.nextBoolean();
        System.out.println("randomBoolean = " + randomBoolean);

        int randomRange = random.nextInt(10); // 0 ~ 9 범위
        System.out.println("randomRange = " + randomRange);

        int randomRange2 = random.nextInt(10) + 1; //1~ 10 까지 출력
        System.out.println("randomRange2 = " + randomRange2);
    }
}
