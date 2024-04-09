package chap21.car2;

public class K3 implements Car{
    @Override
    public void startEngine() {
        System.out.println("K3.startEngin");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("K3Car.pressAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car.stopEngine");

    }
}
