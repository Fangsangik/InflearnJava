package chap21.car2;

public class NewCar implements Car{
    @Override
    public void startEngine() {
        System.out.println("car.startEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("car.pressAccelerator");
    }

    @Override
    public void offEngine() {
        System.out.println("Car.offEngine");
    }
}
