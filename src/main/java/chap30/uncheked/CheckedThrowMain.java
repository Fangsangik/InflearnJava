package chap30.uncheked;


public class CheckedThrowMain {
    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow();
        System.out.println("장상 종료");
    }
}
