package chap20.abstractAnimal;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        caw.move();
        caw.sound();
        soundAnimal(cat);
        soundAnimal(dog);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("시작");
        animal.sound();
        System.out.println("끝");
    }
}
