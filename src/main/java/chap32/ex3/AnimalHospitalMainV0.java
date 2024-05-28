package chap32.ex3;

import chap32.animal.Cat;
import chap32.animal.Dog;

public class AnimalHospitalMainV0 {
    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("고양이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

        //타입에 대한 결정을 나중으로 미루면 -> generic을 사용하는 이유

        //문제1 : 개 병원에 고양이 전달
        //dogHospital.setAnimal(cat); 다른 타입 입력 : 컴파일 오류

        //문제2 : 개 타입 반환
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);
    }
}
