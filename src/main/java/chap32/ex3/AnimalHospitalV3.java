package chap32.ex3;

import chap32.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {

        System.out.println("동물 이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public T getBigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }

    //메서드들이 다 animal에서 제공하는 메서드
}
