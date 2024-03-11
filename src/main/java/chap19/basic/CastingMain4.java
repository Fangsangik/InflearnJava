package chap19.basic;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent = new Child();
        Child child = (Child) parent;
        child.childMethod(); // 문제 없음

        Parent parent1 = new Parent();
        Child child1 = (Child) parent1; //런타임 오류
        child1.childMethod(); // 실행이 불가
    }
}
