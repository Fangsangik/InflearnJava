package chap28.ex3;

//car 에서만 사용
public class Engine {

    private Car car;

    public Engine(Car car){
        this.car = car;
    }

    public void start(){
        System.out.println(car.getChargeLevel());
        System.out.println(car.getModel());
    }
}
