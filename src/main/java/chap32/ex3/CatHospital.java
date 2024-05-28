package chap32.ex3;

import chap32.animal.Cat;
import chap32.animal.Dog;

public class CatHospital {
    private Cat animal;

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물이름 : " + animal.getName());
        System.out.println("동물 크기 : " + animal.getSize());
        animal.sound();
    }

    public Cat bigger (Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
