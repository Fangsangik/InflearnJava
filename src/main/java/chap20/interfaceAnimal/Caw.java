package chap20.interfaceAnimal;

import chap20.abstractAnimal2.AbstractAnimal;

public class Caw implements InterfaceAnimalMain {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("이동");

    }
}
