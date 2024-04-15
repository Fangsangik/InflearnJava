package chap24.builder;

public class LoopStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String rst = "";
        for (int i = 0; i < 100000; i++) {
            rst += "Hello Java";
        }

        long endTime = System.currentTimeMillis();

        System.out.println("rst = " + rst);
        System.out.println("Time = " + (endTime - startTime));
    }
}
