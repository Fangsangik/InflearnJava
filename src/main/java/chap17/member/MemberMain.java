package chap17.member;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member(1L, "Hwang");
        member.print();
        //member.changeData(2L, "Kim");
        member.changeData( "Kim");
        member.print();
    }
}
