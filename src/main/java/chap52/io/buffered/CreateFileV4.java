package chap52.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static chap52.io.buffered.BufferedConst.*;

public class CreateFileV4 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long start = System.currentTimeMillis();

        byte[] buffer = new byte[FILE_SIZE];
        for (int i = 0; i < FILE_SIZE; i++) {
            buffer[i] = 1;
        }
        fos.write(buffer);
        fos.close();

        long end = System.currentTimeMillis();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + (FILE_SIZE / 1024 / 1024) + "MB");
        System.out.println("TOTAL TIME = " + (end - start) + "ms");
    }
}
