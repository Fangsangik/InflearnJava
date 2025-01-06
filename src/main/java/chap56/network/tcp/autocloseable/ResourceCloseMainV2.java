package chap56.network.tcp.autocloseable;

public class ResourceCloseMainV2 {
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
        ResourceV1 resource1 = null;
        ResourceV1 resource2 = null;

        try {
            resource1 = new ResourceV1("resource1"); //만약 여기서 터지먄 ?
            resource2 = new ResourceV1("resource2"); //resource2는 null이므로 close() 호출 안됨

            resource1.call();
            resource2.callEx(); // CallException 발생
        } catch (Exception e) {
            System.out.println("ex : " + e);
            throw e;
        } finally {
           //resource2.closeEx();
           //resource1.closeEx();// 이 코드 호출 안됨

            if (resource2 != null) {
                resource2.closeEx(); // CloseException 발생
            }

            // resource1이 close() 호출 안됨
            if (resource1 != null) {
                resource1.closeEx(); // 이 코드는 호출 X
            }
        }
    }
}

/**
 * > Task :chap56.network.tcp.autocloseable.ResourceCloseMainV2.main()
 * resource1 call
 * resource2 call exception
 * ex : chap56.network.tcp.autocloseable.CallException: resource2 call exception
 * resource2 close
 * resource1 close
 * CallException: resource2 call exception
 */