package chap24.changing;

public class MethodChangingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        int rst = adder.add(1).add(2).add(3).getValue();
        //참조값에 .찍어서 호출 가능 바로 호출 가능
        //메서드가 chain 처럼 연결
        System.out.println("rst = " + rst);
    }
}
