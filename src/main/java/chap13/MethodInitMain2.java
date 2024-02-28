package chap13;

public class MethodInitMain2 {
    public static void main(String[] args) {
        MemberInit memberInit = new MemberInit();
        initMember(memberInit, "userA", 15, 90);

        MemberInit memberInit1 = new MemberInit();
        initMember(memberInit1, "userB", 15, 80);

        MemberInit[] members = {memberInit, memberInit1};

        for (MemberInit member : members) {
            System.out.println(member.name + member.age + member.grade);
        }
    }

    static void initMember(MemberInit memberInit, String name, int age, int grade){
        memberInit.name = name;
        memberInit.age = age;
        memberInit.grade = grade;
    }
}
