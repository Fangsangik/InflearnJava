package chap39.practice.member;

import java.util.HashMap;
import java.util.Map;

public class MemberRepository {

    Map<String, Member> save = new HashMap<>();

    public void save(Member member) {
        save.put(member.getId(), member);
    }

    public Member findById(String id) {
        return save.get(id);
    }

    public Member findByName(String name) {
        for (Member member : save.values()) {
            if (member.getName().equals(name)){
                return member;
            }
        }
        return null;
    }

    public void remove(String name) {
        save.remove(name);
    }
}
