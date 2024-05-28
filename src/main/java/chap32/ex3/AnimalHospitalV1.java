package chap32.ex3;

import chap32.animal.Animal;

public class AnimalHospitalV1 {

    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Animal getBigger(Animal target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

    //메서드들이 다 animal에서 제공하는 메서드
}
