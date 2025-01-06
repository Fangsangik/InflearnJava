package chap56.network.tcp.autocloseable;

public class ResourceCloseMainV1 {
    public static void main(String[] args) {
        try {
            logic();
        } catch (CallException e) {
            System.out.println("CallException: " + e.getMessage());
            e.printStackTrace();
        } catch (CloseException e) {
            System.out.println("CloseException: " + e.getMessage());
            e.printStackTrace();
        }

    }

    private static void logic() throws CallException, CloseException {
        ResourceV1 resource1 = new ResourceV1("resource1");
        ResourceV1 resource2 = new ResourceV1("resource2");

        resource1.call();
        resource2.call();

        System.out.println("자원 정리");
        resource2.closeEx();
        resource1.closeEx();
    }
}
