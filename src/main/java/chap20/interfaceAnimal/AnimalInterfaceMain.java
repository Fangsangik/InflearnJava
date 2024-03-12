package chap20.interfaceAnimal;

public class AnimalInterfaceMain {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);
    }

    private static void soundAnimal(InterfaceAnimalMain main){
        System.out.println("소리 시작");
        main.sound();
        System.out.println("소리 끝");
    }
}
