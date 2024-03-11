package chap17.member;

public class Member {
    private final Long id;
    private String name;

    public Member(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void changeData(String name){
        //this.id = id; -> 변경 불가능
        this.name = name;
    }

    public void print(){
        System.out.println("id : " + id + " name : " + name );
    }
}
