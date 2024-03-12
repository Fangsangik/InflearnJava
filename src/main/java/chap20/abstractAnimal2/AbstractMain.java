package chap20.abstractAnimal2;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        caw.move();
        caw.sound();
        caw.move();
        soundAnimal(cat);
        soundAnimal(dog);
    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("시작");
        animal.sound();
        System.out.println("끝");
    }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("이동 시작");
        animal.move();
        System.out.println("이동 끝");
    }
}
