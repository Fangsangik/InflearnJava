package chap55.io.file;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadTextFileV2 {

    private static final String PATH = "temp/hello2.txt";

    public static void main(String[] args) throws IOException {
        String writeString = "abc\n가나다";
        System.out.println("==Write String==");
        System.out.println(writeString);

        Path path = Path.of(PATH);

        //파일 쓰기
        Files.writeString(path, writeString, StandardCharsets.UTF_8);
        //파일 읽기

        //line 단위로 읽기
        System.out.println("==Read String==");

        //지금은 파일을 한번에 모아서 한줄 씩 처리
        //용량이 클 경우 outOfMemory 발생
        //lambda 처리 하면 한줄씩 메모리 구현 가능
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

        //라인 단위로 출력을 하기 위함
        for (int i = 0; i < lines.size(); i++) {
            System.out.println((i + 1) + ": " + lines.get(i));
        }
    }
}
