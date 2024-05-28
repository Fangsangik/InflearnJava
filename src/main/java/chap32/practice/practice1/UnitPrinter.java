package chap32.practice.practice1;

public class UnitPrinter {
    public static <T extends BioUnit> void printV1(Shuttle<T> s1) {
        T unit = s1.out();
        System.out.println("이름 : " + unit.getName() + "hp : " + unit.getHp());
    }

    public static void printV2(Shuttle<? extends BioUnit> s2) {
        BioUnit unit = s2.out();
        System.out.println("이름 : " + unit.getName() + "hp : " + unit.getHp());

    }
}
