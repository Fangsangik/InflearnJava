package chap32.ex3;

import chap32.animal.Animal;
import chap32.animal.Cat;
import chap32.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
        AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        dogHospital.setAnimal(dog);
        //dogHospital.setAnimal(cat); 다른 타입 입력시 compileError
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.getBigger(new Dog("멍멍2", 200));
    }
}
