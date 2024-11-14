package chap54.io.member;

import chap54.io.member.impl.DataMemberRepository;
import chap54.io.member.impl.FileMemberRepository;
import chap54.io.member.impl.ObjectMemberRepository;

import java.util.List;
import java.util.Scanner;

public class MemberConsoleMain {
    //private static final MemberRepository repository = new MemoryMemberRepository();
    //private static final FileMemberRepository repository = new FileMemberRepository();
    //private static final DataMemberRepository repository = new DataMemberRepository();
    private static final ObjectMemberRepository repository = new ObjectMemberRepository();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. 회원 등록 | 2. 회원 목록 조회 | 3. 종료");
            System.out.print("선택 : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    registerMember(sc);
                    break;

                case 2:
                    displayMembers();
                    break;

                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    return;

                case 4:
                    System.out.println("다시 입력하세요");
            }
        }
    }

    private static void registerMember(Scanner scanner) {
        System.out.print("ID 입력 : ");
        String id = scanner.nextLine();

        System.out.print("Name 입력 : ");
        String name = scanner.nextLine();

        System.out.print("Age 입력 : ");
        int age = scanner.nextInt();

        Member member = new Member(id, name, age);
        repository.add(member);
        System.out.println("회원이 성공적으로 등록");
    }

    private static void displayMembers() {
        List<Member> members = repository.findAll();
        for (Member member : members) {
            System.out.printf("[ID : %s, Name : %s, Age : %d]\n]", member.getId(), member.getName(), member.getAge());
        }
    }
}
