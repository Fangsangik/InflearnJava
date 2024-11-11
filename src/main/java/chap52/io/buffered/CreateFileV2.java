package chap52.io.buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static chap52.io.buffered.BufferedConst.*;

public class CreateFileV2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();

        byte[] buffer = new byte[BUFFER_SIZE];
        int bufferIdx = 0;

        for (int i = 0; i < FILE_SIZE; i++) {
            //buffer에다가 값을 1씩 채운다.
            buffer[bufferIdx++] = 1;

            //버퍼가 가득 차면 쓰고, 버퍼를 비움
            //size 만큼 모았다가 -> 한번에 스트림 처리
            if (bufferIdx == BUFFER_SIZE) {
                fos.write(buffer);
                bufferIdx = 0;
            }
        }

        //끝에 오다보면 버퍼가 가득 차지 않고, 남아 있을 수 있음. 남은 부분 끝까지 사용
        if (bufferIdx > 0) {
            fos.write(buffer, 0, bufferIdx);
        }

        fos.close();

        long endTime = System.currentTimeMillis();
        System.out.println("FILE_NAME = " + FILE_NAME);
        System.out.println("FILE_SIZE = " + FILE_SIZE / 1024 / 1024 + "MB");
        System.out.println("TOTAL TIME = " + (endTime - startTime) + "ms");
    }
}
