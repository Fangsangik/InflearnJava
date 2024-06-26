package chap39.practice.member;

public class MemberRepositoryMain {
    public static void main(String[] args) {
        Member member = new Member("황상익", "id1");
        Member member2 = new Member("터진입", "id2");
        Member member3 = new Member("카카로트", "id3");

        MemberRepository repository = new MemberRepository();
        repository.save(member);
        repository.save(member2);
        repository.save(member3);

        Member findMember1 = repository.findById("id1");
        System.out.println("findMember1 = " + findMember1);

        Member findMember3 = repository.findByName("카카로트");
        System.out.println("findMember3 = " + findMember3);

        repository.remove("황상익");
        Member removedMember1 = repository.findById("id1");
        System.out.println("removedMember1 = " + removedMember1);
    }
}
