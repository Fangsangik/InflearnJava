package chap56.network.tcp.autocloseable;

public class ResourceV1 {

    private String name;

    public ResourceV1(String name) {
        this.name = name;
    }

    public void call() {
        System.out.println(name + " call");
    }

    public void callEx() throws CallException {
        System.out.println(name + " call exception");
        throw new CallException(name + " call exception");
    }

    //자원 정리
    public void close() {
        System.out.println(name + " close");
    }

    //정리중 예외 발생
    public void closeEx() throws CloseException {
        System.out.println(name + " close exception");
        throw new CloseException(name + " close exception");
    }
}
