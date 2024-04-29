package chap30.uncheked;

public class Client {
    public void call(){
        throw new MyUncheckedException("ex");
    }
}
