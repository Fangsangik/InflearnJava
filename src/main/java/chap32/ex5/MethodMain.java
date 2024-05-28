package chap32.ex5;

import chap32.animal.Cat;
import chap32.animal.Dog;

public class MethodMain {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 100);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog biggerDog = new Dog("큰 멍멍이", 200);

        //반환 타입 지정 됨
        Dog bigger = AnimalMethod.getBigger(dog, biggerDog);
        System.out.println("bigger = " + bigger);
    }
}
