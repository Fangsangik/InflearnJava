package chap19.basic;

public class CastingMain6 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("parent1");
        call(parent);

        Parent parent1 = new Child();
        System.out.println("parent2");
        call(parent1);
    }

    private static void call(Parent parent){
        parent.parentMethod();
        if (parent instanceof Child child) { //변수 선언  가능
            System.out.println("child 인스턴스");
            child.childMethod();
        }
    }
}
