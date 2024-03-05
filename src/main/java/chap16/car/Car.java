package chap16.car;

public class Car {
    public String model;
    public static int totalCar;

    public Car(String model){
        this.model = model;
        totalCar++;

    }
    public void showCar(Car car){
        System.out.println("차량 구입, 이름 : " + car.model);
    }

    public static void showTotalCar(){
        System.out.println("구매한 차량 수 : " + totalCar);
    }
}
