package chap53.io.text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static chap53.io.text.TextConst.FILE_NAME;

public class BufferWriterMainV4 {
    private static final int BUFFER_SIZE = 8192;

    public static void main(String[] args) throws IOException {
        String writeString = "ABC\n가나다";
        System.out.println("== Write String ==");
        System.out.println(writeString);

        //파일 쓰기
        FileWriter fw = new FileWriter(FILE_NAME, StandardCharsets.UTF_8);
        BufferedWriter bw = new BufferedWriter(fw, BUFFER_SIZE);
        bw.write(writeString);
        bw.close();

        //읽기
        StringBuilder sb = new StringBuilder();
        FileReader fr = new FileReader(FILE_NAME, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(fr, BUFFER_SIZE);

        String line;
        while ((line = br.readLine()) != null) { //반환 타입이 String이기 때문에 null
            sb.append(line).append("\n");
        }

        br.close();

        System.out.println("== Read String ==");
        System.out.println(sb);
    }
}
