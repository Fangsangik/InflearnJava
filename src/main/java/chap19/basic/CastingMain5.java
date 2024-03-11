package chap19.basic;

public class CastingMain5 {
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
        if (parent instanceof Child) {
            //Child 인스턴스인 경우 childMethod() 실행
            System.out.println("child 인스턴스");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
