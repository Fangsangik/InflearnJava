package chap17;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        System.out.println("생성자 초기화");
        ConstructInit constructInit = new ConstructInit(10);
        ConstructInit constructInit1 = new ConstructInit(20);
        System.out.println(constructInit1.val);
        System.out.println(constructInit.val);

        //필드 초기화 -> 이미 초기화 되어 있기 때문에 변경 불가능
        System.out.println("필드 초기화");
        FieldInit fieldInit = new FieldInit();
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        System.out.println(fieldInit.value);
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);

        System.out.println("상수");
        //static 영역
        System.out.println(FieldInit.CONST_VALUE);
    }
}
