package chap28.nested;

public class NestedOuter {
    private static int outClassVal = 3;
    private int outInstanceVal = 2;

    static class Nested{
        private int nestedInstanceVal = 1;

        public void print(){
            //자신의 멤버에 접근
            System.out.println(nestedInstanceVal);

            //바깥 클래스의 인스턴스 멤버에는 접근 할 수 X
            //System.out.println(outInstanceVal);
            //static이기 떄문에 접근 할 수 없음

            //바깥 클래스의 클래스 멤버에는 접근할 수 있다.
            //클래스 영역에 있다, private이어도 접근 가능
            System.out.println(NestedOuter.outClassVal);
        }
    }
}
