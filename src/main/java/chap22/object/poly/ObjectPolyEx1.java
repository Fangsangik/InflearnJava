package chap22.object.poly;

public class ObjectPolyEx1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        dog.sound();
        action(dog);
        action(car);
    }

    private static void action(Object obj){
        //obj.sound(); -> obj 쪽에너는 sound가 없다.

        //겍체에 맞는 다운 캐스팅 필요
        if (obj instanceof Dog dog){
            dog.sound();
        } else if (obj instanceof Car car){
            car.move();
        }

    }
}
