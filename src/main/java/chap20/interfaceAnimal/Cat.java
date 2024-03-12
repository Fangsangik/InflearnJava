package chap20.interfaceAnimal;

import chap20.abstractAnimal2.AbstractAnimal;

public class Cat implements InterfaceAnimalMain{


    @Override
    public void move() {
        System.out.println("이동");
    }

    @Override
    public void sound() {
        System.out.println("야옹");
    }
}
