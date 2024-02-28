package chap13;

public class MemberConstructor2 {
    public static void main(String[] args) {

        MemberConstruct construct = new MemberConstruct("userA", 15, 80);
        MemberConstruct construct1 = new MemberConstruct("userB", 16);

        MemberConstruct[] memberConstructs = {construct, construct1};

        for (MemberConstruct memberConstruct : memberConstructs) {
            System.out.println("이름 :" + memberConstruct.name + "나이 " + memberConstruct.age +
                    "성적 " + memberConstruct.grade);
        }
    }
}
