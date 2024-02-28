package chap13;

public class MethodInitMain {
    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        memberInit.name = "user1";
        memberInit.age = 15;
        memberInit.grade = 90;

        MemberInit memberInit1 = new MemberInit();
        memberInit1.name = "user2";
        memberInit1.age = 15;
        memberInit1.grade = 90;

        MemberInit[] members = {memberInit, memberInit1};

        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }
}
