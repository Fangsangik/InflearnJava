package chap25.practice2;

public class LottoMain {
    public static void main(String[] args) {
        Lotto lotto = new Lotto();
        int[] lottos = lotto.generate();

        for (int num : lottos) {
            System.out.print("num = " + num + " ");
        }
    }
}
