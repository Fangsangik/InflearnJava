package chap52.io.start;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class ByteArrayStreamMain {
    public static void main(String[] args) throws IOException {
        byte[] input = {1, 2, 3};
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write(input);

        ByteArrayInputStream inputStream = new ByteArrayInputStream(outputStream.toByteArray());
        byte[] bytes = inputStream.readAllBytes();
        System.out.println("bytes = " + Arrays.toString(bytes));
    }
}
