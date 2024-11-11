package chap52.io.start;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain3 {
    public static void main(String[] args) throws IOException {
        //파일에 데이터를 출력하는 스트림, 파일이 없으면 자동으로 생성, 데이터를 만들어 해당 파일에 저장
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.dat");
        byte[] input = {65, 66, 67};
        fileOutputStream.write(input);
        fileOutputStream.close();

        //파일에서 데이터를 읽어오는 스트림
        FileInputStream fileInputStream = new FileInputStream("temp/hello.dat");
        byte[] buffer = new byte[10];
        int readCount = fileInputStream.read(buffer, 0, 10); //offset : index 시작 위치
        System.out.println("readCount = " + readCount); //3
        System.out.println(Arrays.toString(buffer));
        fileInputStream.close();
    }
}
