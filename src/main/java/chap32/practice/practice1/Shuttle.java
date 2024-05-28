package chap32.practice.practice1;

public class Shuttle<T extends BioUnit> {

    private T unit;

    public void in(T marine) {
        unit = marine;
    }

    public T out(){
        return unit;
    }

    public void showInfo(){
        System.out.println("이름 : "  + unit.getName() +  "HP : " + unit.getHp());
    }
}
