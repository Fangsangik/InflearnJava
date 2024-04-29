package chap18.chap16.static2;

import static chap18.chap16.static2.DecoData.staticCall;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        staticCall();

        System.out.println("2. 인스턴스 호출");
        DecoData data = new DecoData();
        data.instanceCall();

        System.out.println("3. 인스턴스 호출");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        DecoData data2 = new DecoData();
        staticCall();
        staticCall(); // 추천 하는 방향은 아니다.
    }
}
