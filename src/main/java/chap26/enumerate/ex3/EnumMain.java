package chap26.enumerate.ex3;

public class EnumMain {
    public static void main(String[] args) {
        System.out.println("BASIC = " + Grade.BASIC.getClass() );
        System.out.println("GOLD = " + Grade.GOLD.getClass() );
        System.out.println("DIAMOND = " + Grade.DIAMOND.getClass());

        System.out.println("BASIC = " + refVal(Grade.BASIC));
        System.out.println("BASIC = " + refVal(Grade.GOLD));
        System.out.println("BASIC = " + refVal(Grade.DIAMOND));
    }

    public static String refVal(Grade grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
