package nested.inner;

public class InnerOuter {
    private static int outClassVal = 3;
    private int outInstanceVal = 2;

    class Inner {
        private int innerInstanceVal = 1;

        public void print(){
            //자기 자신 접근
            System.out.println(innerInstanceVal);

            //외부 클래스의 인스턴스 접근
            System.out.println(outInstanceVal);
        }
    }

}
