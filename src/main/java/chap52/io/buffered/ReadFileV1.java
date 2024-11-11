package chap52.io.buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static chap52.io.buffered.BufferedConst.FILE_NAME;

public class ReadFileV1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();
        int fileSize = 0;
        int data;
        while ((data = fis.read()) != -1) {
            fileSize++;
        }
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + (fileSize / 1024 / 1024) + "MB");
        System.out.println("TOTAL TIME = " + (endTime - startTime) + "ms");
    }
}
