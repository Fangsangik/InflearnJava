package chap20.animal2;

public class AnimalSoundMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        //추가 되더 라도 변하지 않는 것
        Animal[] all = new Animal[]{dog, cat, cow};
        for (Animal animal : all) {
            System.out.println("동물 소리 시작");
            animal.sound();
            System.out.println("동물 소리 끝");
        }

    }
}
