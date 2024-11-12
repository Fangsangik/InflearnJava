package chap53.io.text;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static chap53.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV1 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";

        //문자 -> byte UTF-8 인코딩
        byte[] writeBytes = writeString.getBytes(StandardCharsets.UTF_8); //문자를 byte 숫자로 변경 -> 문자 집합을 지정
        System.out.println(writeString);
        System.out.println("writeBytes = " + Arrays.toString(writeBytes));

        //파일 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        fos.write(writeBytes);
        fos.close();

        //파일 읽기
        //읽을때도 바이트 배열이 저장
        FileInputStream fis = new FileInputStream(FILE_NAME);
        byte[] readBytes = fis.readAllBytes();
        fis.close();

        //byte -> String 디코딩
        String readString = new String(readBytes, StandardCharsets.UTF_8);

        System.out.println("readBytes = " + Arrays.toString(readBytes));
        System.out.println("readString = " + readString);
    }
}
