package chap55.io.file;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Stream;

public class NewFilesPath {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("temp/.."); // /.. 상위 결로 부터 ~ ....
        System.out.println("path = " + path);
        System.out.println("Absolute Path = " + path.toAbsolutePath()); // 절대 경로
        System.out.println("Canonical path = " + path.toRealPath()); // 상대 경로

        Stream<Path> pathStream = Files.list(path);
        List<Path> list = pathStream.toList();
        pathStream.close();;

        for (Path p : list) {
            System.out.println((Files.isRegularFile(p) ? "F" : "D") + " | " + p.getFileName());
        }
    }
}
