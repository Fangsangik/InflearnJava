package chap54.io.member.impl;

import chap54.io.member.Member;
import chap54.io.member.MemberRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataMemberRepository implements MemberRepository {
    private static final String FILE_PATH = "temp/members-txt.dat";


    @Override
    public void add(Member member) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE_PATH, true));
            dos.writeUTF(member.getId());
            dos.writeUTF(member.getName());
            dos.writeInt(member.getAge());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        List<Member> members = new ArrayList<>();
        try {
            DataInputStream dis = new DataInputStream(new FileInputStream(FILE_PATH));

            //더 앍어올 파일이 있는지
            while (dis.available() > 0) {
                //저장한 순서대로 조회
                //2byte를 숫자로 쓰고, 뒤에 값들을 넣는다.
                //읽어드릴때 숫자를 우선 읽고 그 뒤에 값들을 읽음
                members.add(new Member(dis.readUTF(), dis.readUTF(), dis.readInt()));
            }
            return members;
        } catch (FileNotFoundException e) {
            return new ArrayList<>();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
