package chap13;

public class MethodInitMain3 {
    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        memberInit.initMember("userA", 15, 90);

        MemberInit memberInit1 = new MemberInit();
        memberInit.initMember("userB", 15, 80);

        MemberInit[] members = {memberInit, memberInit1};

        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }
}
