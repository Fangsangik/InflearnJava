package chap31.ex3;

public class NetworkServiceV3_2 {
    public void sendMessage(String data) {
        String address = "http://ex.com";

        NetworkClientV3 client = new NetworkClientV3(data);
        client.initError(data);

        try {
            client.connect();
            client.send(data);

        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 코드 " + e.getAddress() + " , 메시지 " + e.getMessage());
        }catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지 " + e.getMessage());
        } catch (Exception e){
            System.out.println("[알수 없는 오류], 메시지 " + e.getMessage());
        } finally {
            client.disconnect();
        }
    }
}
