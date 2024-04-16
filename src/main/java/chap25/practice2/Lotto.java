package chap25.practice2;

import java.util.Random;

public class Lotto {
    private Random random = new Random();
    private int[] lottoNumber;
    private int cnt;

    public int[] generate() {
        lottoNumber = new int[6];
        cnt = 0;

        while (cnt < 6){
            int num = random.nextInt(45) + 1;
            if (isSame(num)){
                lottoNumber[cnt] = num;
                cnt++;
            }
        }
        return lottoNumber;
    }

    public boolean isSame(int number){
        for (int i = 0; i < cnt; i++) {
            if (lottoNumber[i] == number){
                return false;
            }
        }
        return true;
    }
}
