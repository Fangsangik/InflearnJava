package chap20.animal2;

public class AnimalSoundMain4 {
    public static void main(String[] args) {
        Animal[] all = {new Dog(), new Cat(), new Cow()};
        for (Animal animal : all) {
            soundAnimal(animal);
        }

    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 시작");
        animal.sound();
        System.out.println("동물 소리 끝");
    }
}
