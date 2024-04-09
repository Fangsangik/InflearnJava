package chap21.car2;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        K3 k3 = new K3();
        driver.setCar(k3);
        driver.driver();

        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.driver();

        Car newCar = new NewCar();
        driver.setCar(newCar);
        driver.driver();
    }
}
