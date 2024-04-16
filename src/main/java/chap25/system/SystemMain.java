package chap25.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        //현재 시간을 밀리초를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        //현재 시간을 나노초를 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        //환경변수를 읽는다.
        System.out.println("System.getenv() = " + System.getenv());

        //시스탬 속성을 읽는다.
        System.out.println("System.getProperties() = " + System.getProperties());
        //자바가 사용하는 운영체제

        System.out.println("System.getProperty(javaVersion) = " + System.getProperty("javaVersion"));
        //"javaVersion" -> javaVersion을 읽을 수 있다.

        //배열을 고속으로 복사
        char[] originalArray = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] copy = new char[5];
        //0부터 copy를 해서 0번 부터 복사해서 넣는다.
        //통채로 hardware에서 읽어서 빠름
        System.arraycopy(originalArray, 0, copy, 0, originalArray.length);

        System.out.println("copy = " + copy);
        //toString을 사용해서 이쁘게 넣어줌
        System.out.println(" = " + Arrays.toString(copy));

        System.exit(0);
    }
}
