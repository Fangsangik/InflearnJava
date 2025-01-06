package chap56.network.tcp.v1;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress 클래스는 IP 주소를 다루는 클래스
 * InetAddress.getByName("호스트명") : IP 주소 얻어옴
 */
public class InetAddressMain {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println("localhost = " + localhost);

        InetAddress google = InetAddress.getByName("google.com");
        System.out.println("google = " + google);
    }
}
