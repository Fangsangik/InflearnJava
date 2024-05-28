package chap32.ex5;

import chap32.animal.Animal;

//제네릭 타입을 생성
public class ComplexBox<T extends Animal>{

    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public <Z> Z printAnimalReturn(Z z){
        System.out.println("animal.className: " + animal.getClass().getName());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }
}
