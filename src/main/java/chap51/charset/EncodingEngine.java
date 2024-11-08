package chap51.charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingEngine {
    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("==ASCII 영문 처리==");
        encoding("A", US_ASCII);
        encoding("A", ISO_8859_1);
        encoding("A", EUC_KR);
        encoding("A", MS_949);
        encoding("A", UTF_8);
        encoding("A", UTF_16BE); // 2byte 단위로 하기 때문에 지원 X

        System.out.println("==한글 지원==");
        encoding("가", EUC_KR);
        encoding("가", MS_949);
        encoding("가", UTF_8); //한글에 대해서는 호한이 안됨
        encoding("가", UTF_16BE);
    }

    //모든 문자를 byte로 변경할 때는 인코딩 표가 있어야 함

    private static void encoding(String text, Charset charset) {
        byte[] bytes = text.getBytes(charset);
        System.out.printf("%s -> [%s] 안코딩 -> %s %sbyte\n", text, charset, Arrays.toString(bytes), bytes.length);
    }
}
