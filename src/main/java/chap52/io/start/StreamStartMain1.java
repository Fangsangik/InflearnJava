package chap52.io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain1 {
    public static void main(String[] args) throws IOException {
        //파일에 데이터를 출력하는 스트림, 파일이 없으면 자동으로 생성, 데이터를 만들어 해당 파일에 저장
        //append true -> 이어서 적는다
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.dat");
        //ASCII code -> decoding
        fileOutputStream.write(65);
        fileOutputStream.write(66);
        fileOutputStream.write(67);
        fileOutputStream.close();

        //파일에서 데이터를 읽어오는 스트림
        FileInputStream fileInputStream = new FileInputStream("temp/hello.dat");
        //ASCII code -> incoding
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read()); // 더이상 반환 할 값이 없다면 -1
        fileInputStream.close();
    }
}
