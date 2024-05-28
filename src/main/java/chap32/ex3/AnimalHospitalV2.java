package chap32.ex3;

import chap32.animal.Animal;

public class AnimalHospitalV2<T> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup(){
        //T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용 가능(toString, equals 등등)
//        System.out.println("동물 이름 : " + animal.getName());
//        System.out.println("동물 크기 : " + animal.getSize());
//        animal.sound();

        animal.toString();
        animal.equals(null);
    }

    public Animal getBigger(Animal target){
       // return animal.getSize() > target.getSize() ? animal : target;
        return null;
    }

    //메서드들이 다 animal에서 제공하는 메서드
}
