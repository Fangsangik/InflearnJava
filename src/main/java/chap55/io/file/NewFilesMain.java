package chap55.io.file;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class NewFilesMain {
    public static void main(String[] args) throws IOException {

        Path file = Path.of("temp/example.txt");
        Path directory = Path.of("temp/exampleDir");

        // 1. exists(): 파일이나 디렉토리의 존재 여부를 확인
        System.out.println("file = " + Files.exists(file));

        // 2. createFile(): 새 파일을 생성
        try {
            Files.createFile(file);
            System.out.println("File created");
        } catch (FileAlreadyExistsException e) {
            System.out.println(file + "File already exists");
        }

        // 3. createDirectory(): 새 디렉토리를 생성
        try {
            Files.createDirectory(directory);
            System.out.println("Directory created");
        } catch (FileAlreadyExistsException e) {
            System.out.println(directory + "Directory already exists");
        }

        // 4. delete(): 파일이나 디렉토리를 삭제
//        Files.delete(file);
//        System.out.println("File deleted");

        // 5. isReqularFile() : 일반파일인지 확인
        System.out.println("file = " + Files.isRegularFile(file));

        // 6. isDirectory() : 디렉토리인지 확인
        System.out.println("Files.isDirectory(directory) = " + Files.isDirectory(directory));

        //7. getFilesName() : 파일이나 디렉토리의 이름 확인
        System.out.println("file = " + file.getFileName());

        //8. size() : 파일의 크기를 바이트 단위로 변환
        System.out.println("Files.size(file)  = " + Files.size(file) + "bytes");

        // 9. move(): 파일의 이름을 변경하거나 이동
        Path newFile = Paths.get("temp/newExample.txt");
        Files.move(file, newFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File moved/renamed");

        // 10. getLastModifiedTime(): 마지막으로 수정된 시간을 반환
        System.out.println("Last modified: " + Files.getLastModifiedTime(newFile));

        // 추가: readAttributes(): 파일의 기본 속성들을 한 번에 읽기
        BasicFileAttributes attrs = Files.readAttributes(newFile, BasicFileAttributes.class);
        System.out.println("==Attributes==");
        System.out.println("Creation time : " + attrs.creationTime());
        System.out.println("Is directory : " + attrs.isDirectory());
        System.out.println("Is regular file : " + attrs.isRegularFile());
        // 파일 시스템 다루다 보면 symbolic link라는 것이 있음
        System.out.println("Is symbolic link : " + attrs.isSymbolicLink());
        System.out.println("Size : " + attrs.size());
    }
}
