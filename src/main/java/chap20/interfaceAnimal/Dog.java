package chap20.interfaceAnimal;

import chap20.abstractAnimal2.AbstractAnimal;

public class Dog implements InterfaceAnimalMain {
    @Override
    public void sound() {
        System.out.println("명멍");
    }

    @Override
    public void move() {
        System.out.println("이동");

    }
}
