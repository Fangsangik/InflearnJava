package nested;

public class ShdowingMain {
    public int val = 1;

    class Inner{
        public int val = 2;

        void go(){
            int val = 3;
            System.out.println("val = " + val);
            //나의 인스턴스 val
            System.out.println("this.val = " + this.val);
            //바깥 클래스 접근
            System.out.println(ShdowingMain.this.val);
        }
    }

    public static void main(String[] args) {
        ShdowingMain main = new ShdowingMain();
        Inner inner = main.new Inner();
        inner.go();
    }
}
