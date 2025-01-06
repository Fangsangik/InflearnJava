package chap56.network.tcp.autocloseable;

public class ResourceCloseMainV4 {
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

    // try-with-resources 사용
    // 자동으로 close 호출
    private static void logic() throws CallException, CloseException {
      try (ResourceV2 resource1 = new ResourceV2("resource1");
           ResourceV2 resource2 = new ResourceV2("resource2")) {

          resource1.call();
          resource2.callEx(); // CallException 발생
      } catch (CallException e) {
          System.out.println("ex : " + e);
          throw e;
      } catch (Exception e) {
          throw new RuntimeException(e);
      }
    }
}

/**
 * chap56.network.tcp.autocloseable.CallException: resource2 call exception
 * Suppressed: chap56.network.tcp.autocloseable.CloseException: resource1 close exception
 *
 * closeException 발생 -> closeException을 Suppressed로 처리
 * 핵심예외 안에 다른 예외를 담아두고, 핵심예외를 처리하면서 다른 예외를 처리할 수 있도록 함
 */