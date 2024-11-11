package chap52.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static chap52.io.buffered.BufferedConst.BUFFER_SIZE;
import static chap52.io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];
        int fileSize = 0;
        int size;
        while ((size = fis.read()) != -1) {
            fileSize += size;
        }
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + (fileSize / 1024 / 1024) + "MB");
        System.out.println("TOTAL TIME = " + (endTime - startTime) + "ms");
    }
}
