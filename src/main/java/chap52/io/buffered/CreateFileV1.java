package chap52.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static chap52.io.buffered.BufferedConst.FILE_NAME;
import static chap52.io.buffered.BufferedConst.FILE_SIZE;

public class CreateFileV1 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < FILE_SIZE; i++) {
            fos.write(1); // 한번 호출애 1byte 형성, 1000만번 호출 -> 10MB 파일 형성
        }
        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("TOTAL TIME = " + (endTime - startTime) + "ms");
    }
}
