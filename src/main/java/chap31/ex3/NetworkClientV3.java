package chap31.ex3;


public class NetworkClientV3 {
    private final String address;
    public boolean connectError;
    private boolean sendError;

    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void connect() throws ConnectExceptionV3{
        if (connectError) {
            throw new ConnectExceptionV3("connectError", address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String str) throws SendExceptionV3{
        if (sendError) {
            throw new SendExceptionV3("sendError", address + " 서버 데이터 전송 실패");
            //throw new RuntimeException("ex");
        }

        System.out.println(address + " 서버에 데이터 전송 " + str);
    }

    public void disconnect() {
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }

        if (data.contains("error2")) {
            sendError = true;
        }
    }
}
