package chap56.network.tcp.autocloseable;

public class ResourceV2 implements AutoCloseable{

    //AutoCloseable
    //try-with-resources 구문을 사용하기 위해서는 AutoCloseable 인터페이스를 구현해야 한다.

    private String name;

    public ResourceV2(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + " call");
    }

    public void callEx() throws CallException {
        System.out.println(name + " call exception");
        throw new CallException(name + " call exception");
    }

    //정리중 예외 발생
    public void closeEx() throws CloseException {
        System.out.println(name + " close exception");
        throw new CloseException(name + " close exception");
    }

    @Override
    public void close() throws Exception {
        System.out.println(name + " close");
        throw new CloseException(name + " close exception");
    }
}
