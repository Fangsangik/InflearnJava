package chap30.exception;

/**
 * exception을 상속 받은 예외는 check 예외가 된다
 */
public class MyCheckedException extends Exception{
  public MyCheckedException (String message){
      super(message);
  }
}
