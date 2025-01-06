package chap55.io.file;

import java.io.File;
import java.io.IOException;
import java.util.Date;

//예전에 쓰던 방식
public class OldFileMain {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/example.txt");
        File directory = new File("temp/exampleDir");

        //1. Exists : 파일이나 디렉토리의 존재 여부 확인
        System.out.println("file = " + file.exists());

        //2. createNewFile : 새파일 생성
        boolean created = file.createNewFile();
        System.out.println("created = " + created);

        //3. mkdir() : 새 디렉토리를 생성
        boolean dirCreated = directory.mkdir();
        System.out.println("dirCreated = " + dirCreated);

        //4. delete : 파일이나 디렉토리를 삭제
//        boolean deleted = file.delete();
//        System.out.println("deleted = " + deleted);

        //5. isFile : 파일인지 확인
        System.out.println("file = " + file.isFile());

        //6. isDirectory : 디렉토리인지 확인
        System.out.println("directory.isDirectory() = " + directory.isDirectory());

        //7. getName() : 파일이나 디렉토리 이름을 변환
        System.out.println("file.getName() = " + file.getName());

        //8. length() : 파일의 크기를 바이트로 변환
        System.out.println("file.length() = " + file.length() + "bytes");

        //9. renameTo(File dest) : 파일의 이름을 변경하거나 이동
        File newFile = new File("temp/newExample.txt");
        boolean renamed = file.renameTo(newFile);
        System.out.println("renamed = " + renamed);

        //10. lastModified() : 마지막으로 수정된 시간을 반환
        long lastModified = newFile.lastModified();
        System.out.println("lastModified = " + new Date(lastModified));
    }
}
