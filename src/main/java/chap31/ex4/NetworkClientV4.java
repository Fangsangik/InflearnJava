package chap31.ex4;




public class NetworkClientV4 {
    private final String address;
    public boolean connectError;
    private boolean sendError;

    public NetworkClientV4(String address) {
        this.address = address;
    }

    public void connect(){
        if (connectError) {
            throw new ConnectExceptionV4("connectError", address + " 서버 연결 실패");
        }
        System.out.println(address + " 서버 연결 성공");
    }

    public void send(String str) {
        if (sendError) {
            throw new SendExceptionV4("sendError", address + " 서버 데이터 전송 실패");
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
