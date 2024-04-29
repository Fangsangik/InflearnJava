package chap18.chap16.car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("K3");
        Car car2 = new Car("G80");
        Car car3 = new Car("Model Y");

        car1.showCar(car1);
        car2.showCar(car2);
        car3.showCar(car3);
        Car.showTotalCar();


    }
}
