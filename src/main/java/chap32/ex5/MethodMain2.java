package chap32.ex5;

import chap32.animal.Animal;
import chap32.animal.Cat;
import chap32.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("고양이", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.setAnimal(dog);

        Cat returnCat = hospital.printAnimalReturn(cat);
        System.out.println("returnCat = " + returnCat);
    }
}
