package chap37.member;

public class JavaHashCodeMain {
    public static void main(String[] args) {
        //Object의 기본 hashcode는 객체의 참조값을 기반
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1 = " + obj1.hashCode());
        System.out.println("obj2 = " + obj2.hashCode());

        //각 클래스마다 hashCode를 이미 오버리이딩
        Integer i = 10;
        String strA = "A";
        String strB = "AB";

        System.out.println("i = " + i.hashCode());
        System.out.println("strA = " + strA.hashCode());
        System.out.println("strB = " + strB.hashCode());

        //hashCode는 마이너스 값 들어올 수 있다.
        System.out.println("-1.hashCode = " + Integer.valueOf(-1).hashCode());

        //둘은 같을까?? 인스턴스는 다르지만, equals는 같다
        Member member1 = new Member("idA");
        Member member2 = new Member("idB");

        //equals, hashCode를 오버라이딩 하지 않은 경우와 한 경우 비교
        System.out.println("(member1 == member2) = " + (member1 == member2));
        System.out.println("member1 equals member2 = " + member1.equals(member2));

        System.out.println("hashCode 오버라이딩 한 case");
        System.out.println("member1.hashCode() = " + member1.hashCode());
        System.out.println("member2.hashCode() = " + member2.hashCode());
    }
}
