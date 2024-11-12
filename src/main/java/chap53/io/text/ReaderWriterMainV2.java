package chap53.io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static chap53.io.text.TextConst.FILE_NAME;

public class ReaderWriterMainV2 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString = " + writeString);

        //파일 쓰기
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        //Stream에 byte 대신 문자를 저장 (OutputStream은 바이트 단위, writer은 문자로)
        //OutputStream을 상속 받는 것이 아닌 write를 상속 받고 있다.
        OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
        //바이트 코드로 변경된다.
        osw.write(writeString);
        osw.close();

        //파일 읽기
        //읽을때도 바이트 배열이 저장
        FileInputStream fis = new FileInputStream(FILE_NAME);
        //스트림에 byte대신 문자를 읽을 수 있게 지원 (byte stream -> read)
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);

        StringBuilder content = new StringBuilder();
        int ch;
        while ((ch = isr.read()) != -1) { //character를 하나씩 읽어서 2byte씩 읽어서 반환
            content.append((char) ch);
        }
        isr.close();

        System.out.println("String reader = " + content);
    }
}
