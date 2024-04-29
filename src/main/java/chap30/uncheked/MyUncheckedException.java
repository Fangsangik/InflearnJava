package chap30.uncheked;

/**
 * RuntimeException을 상속받은 예외는 언체크 예외가 필요
 */
public class MyUncheckedException extends RuntimeException{
    public MyUncheckedException(String message){
        super(message);
    }
}
