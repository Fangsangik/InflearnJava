package chap37.member;

import java.util.Objects;

public class MemberOnlyHash {
    private String id;

    public MemberOnlyHash(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MemberNoHashNoEq{" +
                "id='" + id + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
