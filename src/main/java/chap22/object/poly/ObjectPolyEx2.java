package chap22.object.poly;

public class ObjectPolyEx2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object();

        Object[] obj = {dog, car, object};
        size(obj);
    }

    private static void size(Object[] obj){
        System.out.println("전달된 객체의 수 : " + obj.length);
    }
}
