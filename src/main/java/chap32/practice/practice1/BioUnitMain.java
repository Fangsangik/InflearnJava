package chap32.practice.practice1;

public class BioUnitMain {
    public static void main(String[] args) {
        Marine marine1 = new Marine("마린1", 40);
        Marine marine2 = new Marine("마린2", 50);
        Marine resultMarine = UnitUtil.maxHp(marine1, marine2);
        System.out.println("resultMarine = " + resultMarine);

        Zealot zealot1 = new Zealot("질럿 1" , 150);
        Zealot zealot2 = new Zealot("질럿 2" , 200);
        Zealot rstZealot = UnitUtil.maxHp(zealot1, zealot2);
        System.out.println("rstZealot = " + rstZealot);

    }
}
