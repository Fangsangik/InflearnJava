package chap15.access.b;

public class PublicClass {
    public static void main(String[] args) {
        chap15.access.a.PublicClass publicClass = new chap15.access.a.PublicClass();

        //다른 패키지 접근 불가 (default)
//      chap15.access.a.PublicClass1 publicClass1 = new PublicClass1();
    }
}
