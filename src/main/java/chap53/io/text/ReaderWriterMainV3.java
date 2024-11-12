package chap53.io.text;

import java.io.*;

import static chap53.io.text.TextConst.FILE_NAME;
import static java.nio.charset.StandardCharsets.*;

public class ReaderWriterMainV3 {
    public static void main(String[] args) throws IOException {
        String writeString = "ABC";
        System.out.println("writeString = " + writeString);

        //파일 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, UTF_8);
        fw.write(writeString);
        fw.close();

        //파일 읽기
        StringBuilder content = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, UTF_8);
        int ch;
        while ((ch = fr.read()) != -1) { //character를 하나씩 읽어서 2byte씩 읽어서 반환
            content.append((char) ch);
        }
        fr.close();

        System.out.println("String reader = " + content);
    }
}
