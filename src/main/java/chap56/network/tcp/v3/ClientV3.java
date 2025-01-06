package chap56.network.tcp.v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import static chap56.util.MyLogger.log;

public class ClientV3 {
    private static final int PORT = 12345;

    public static void main(String[] args) throws IOException {
        log("Client started");
        Socket socket = new Socket("localhost", PORT);
        // 외부에 데이터 받을 수 있고
        DataInputStream input = new DataInputStream(socket.getInputStream()); // 보조 스트림 사용 socket.getInputStream()
        // 외부에 데이터를 보낼 수 있고
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        log("socket connected" + socket);

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("메시지 입력: ");
            String toSend = sc.nextLine();

            output.writeUTF(toSend);
            log("client -> server: " + toSend);

            if (toSend.equalsIgnoreCase("exit")) {
                break;
            }

            String received = input.readUTF();
            log("server -> client: " + received);
        }

        // 자원 정리
        log("연결 종료: " + socket);
        input.close();
        output.close();
        socket.close();
    }
}

/**
 * V2 client 한명이 한 서버에 접속하면 잘 작동
 * 하지만 여러명이 접속하면 서버가 한명에게만 응답을 해준다. socket과는 연결이 되어 있음
 */