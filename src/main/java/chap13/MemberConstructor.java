package chap13;

public class MemberConstructor {
    public static void main(String[] args) {

        MemberConstruct construct = new MemberConstruct("userA", 15, 80);
        MemberConstruct construct1 = new MemberConstruct("userB", 16, 90);

        MemberConstruct[] memberConstructs = {construct, construct1};

        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println(memberConstruct.name + memberConstruct.age + memberConstruct.grade);
        }

    }
}
