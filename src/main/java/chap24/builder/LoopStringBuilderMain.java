package chap24.builder;

public class LoopStringBuilderMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello Java");
        }

        String rst = sb.toString();
        long endTime = System.currentTimeMillis();

        System.out.println("rst = " + rst);
        System.out.println("Time = " + (endTime - startTime));
    }
}
