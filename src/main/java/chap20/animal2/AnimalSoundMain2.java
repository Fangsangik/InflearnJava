package chap20.animal2;

public class AnimalSoundMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 울음 소리 시작");
        animal.sound();
        System.out.println("동물 울음 소리 종료");
    }
}
