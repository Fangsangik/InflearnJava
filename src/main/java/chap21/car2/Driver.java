package chap21.car2;

public class Driver {

    private Car car;

    public void setCar(Car car){
        System.out.println("자동차를 설정합니다 " + car);
    }

    public void driver(){
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();
    }
}
