package chap54.io.member.impl;

import chap54.io.member.Member;
import chap54.io.member.MemberRepository;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileMemberRepository implements MemberRepository {

    private static final String FILE_PATH = "temp/members-txt.dat";
    private static final String DELIMITER = ",";

    @Override
    public void add(Member member) {
        //계속 추가 해야하기 때문에 append true (항상 인코딩 정보 들어가야 함)
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_PATH, StandardCharsets.UTF_8, true))) {
            bw.write(member.getId() + DELIMITER + member.getName() + DELIMITER + member.getAge());
            bw.newLine(); //enter
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(FILE_PATH, StandardCharsets.UTF_8))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] memberData = line.split(DELIMITER); //, 단위로 자름
                //회원 데이터를 만듬
                members.add(new Member(memberData[0], memberData[1], Integer.valueOf(memberData[2])));
            }

            return members;
            //회원 목록조회를 바로 할 경우, 회원 저장 안된 것이기 때문에 -> Exception을 잡음
        } catch (FileNotFoundException e) {
            return new ArrayList<>(); // 빈 값으로 반환
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
