package chap51.charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static java.nio.charset.StandardCharsets.*;

public class EncodingEngineV2 {
    private static final Charset EUC_KR = Charset.forName("EUC-KR");
    private static final Charset MS_949 = Charset.forName("MS949");

    public static void main(String[] args) {
        System.out.println("==ASCII 영문 처리==");
        test("A", US_ASCII, US_ASCII);
        test("A", US_ASCII, ISO_8859_1);
        test("A", EUC_KR, US_ASCII);
        test("A", US_ASCII, MS_949);
        test("A", US_ASCII, UTF_8);
        test("A", US_ASCII, UTF_16BE); // 2byte 단위로 하기 때문에 지원 X

        System.out.println("==한글 지원 기본==");
        test("가", US_ASCII, US_ASCII);
        test("가", ISO_8859_1, ISO_8859_1);
        test("가", EUC_KR, EUC_KR); //한글에 대해서는 호한이 안됨
        test("가", MS_949, MS_949);
        test("가", UTF_8, UTF_8);
        test("가", UTF_16BE, UTF_16BE);

        System.out.println("==한글 인코딩 복잡한 문자 ==");

        test("뷁", EUC_KR, EUC_KR);
        test("뷁", MS_949, MS_949);
        test("뷁", UTF_8, UTF_8);
        test("뷁", UTF_16BE, UTF_16BE);

        System.out.println("== 한글 인코딩, 디코딩이 다른 경우");
        test("가", EUC_KR, MS_949);
        test("뷁", MS_949, EUC_KR);
        test("가", EUC_KR, UTF_8);
        test("가", MS_949, UTF_8);
        test("가", UTF_8, MS_949);

        System.out.println("== 영문 인코딩 - 디코딩이 다른 경우 ==");
        test("A", EUC_KR, UTF_8);
        test("A", MS_949, UTF_8);
        test("A", UTF_8, MS_949);
        test("A", UTF_8, UTF_16BE);
    }

    //모든 문자를 byte로 변경할 때는 인코딩 표가 있어야 함

    private static void test(String text, Charset encoding, Charset decoding) {
        byte[] encoded = text.getBytes(encoding);
        String decoded = new String(encoded, encoding);
        System.out.printf("%s -> [%s] 인코딩 -> %s %sbyte -> [%s] 디코딩 -> %s\n",
                text, encoding, Arrays.toString(encoded),
                encoded.length,
                decoding, decoded);
    }
}
