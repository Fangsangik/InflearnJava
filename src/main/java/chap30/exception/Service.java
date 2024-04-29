package chap30.exception;

public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리 -> 정상 흐름으로 돌아감
     */

    public void callCatch(){
        try {
            client.call();
        } catch (MyCheckedException e) {
            System.out.println("예외 처리, message : " + e.getMessage());
        }
        System.out.println("정상 흐름");
    }

    /**
     * @throws MyCheckedException
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지면, throws 예외를 메서드에 필수로 선언
     * 예외 처리를 못하겠다.
     */
    public void callThrow() throws MyCheckedException {
        client.call();
    }
}
