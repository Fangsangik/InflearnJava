package chap54.io.member.impl;

import chap54.io.member.Member;
import chap54.io.member.MemberRepository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectMemberRepository implements MemberRepository {
    private static final String FILE_PATH = "temp/members-txt.dat";


    //객체를 byte화 하면 network에 전송하는 것 또한 가능 하다.
    @Override
    public void add(Member member) {
        //회원을 전체를 한번에 저장
        List<Member> members = findAll();
        members.add(member);

        try {
            //ObjectOutputStream 객체를 직렬화 해주는 기능
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH));
            oos.writeObject(members);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Member> findAll() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH));
            Object findObject = ois.readObject();
            //회원 객체를 하나씩 저장하면 하나씩 밖에 안되지만, 통체로 파일로 만들어서 읽어온다.
            return (List<Member>) findObject;
        } catch (FileNotFoundException e) {
            //return List.of() //수정할 수 없는 빈 컬렉션을 반환
            return new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
