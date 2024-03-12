package chap20.abstractAnimal2;

public class Dog extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("명멍");
    }

    @Override
    public void move() {
        System.out.println("이동");

    }
}
