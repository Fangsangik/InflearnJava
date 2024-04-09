package chap21.car;

public class CarMain0 {
    public static void main(String[] args) {
        Driver driver = new Driver();
        K3Car k3Car = new K3Car();
        Model3Car model3Car = new Model3Car();

        driver.setDriver(k3Car); //자동차를 갖게 됨
        driver.drive();

        System.out.println("====================");
        driver.setDriver(null); //참조 제거
        driver.setModel3Car(model3Car);
        driver.drive();
    }
}
