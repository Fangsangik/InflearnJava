package chap20.abstract_and_interface;

public class AnimalMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        Cat cat = new Cat();

        soundAnimal(dog);
        soundAnimal(cat);

        flyAnimal(bird);

    }

    private static void soundAnimal(AbstractAnimal animal){
        System.out.println("시작");
        animal.sound();
        System.out.println("끝");
    }

    private static void moveAnimal(AbstractAnimal animal){
        System.out.println("시작");
        animal.move();
        System.out.println("끝");
    }

    private static void flyAnimal(Fly fly){
        System.out.println("시작");
        fly.fly();
        System.out.println("끝");
    }
}
