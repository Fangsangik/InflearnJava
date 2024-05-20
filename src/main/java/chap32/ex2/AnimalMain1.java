package chap32.ex2;

import chap32.animal.Animal;
import chap32.animal.Cat;
import chap32.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0);
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 50);

        Box<Dog> dogBox = new Box<>();
        dogBox.get();
        Dog findDob = dogBox.get();
        System.out.println("findDob = " + findDob);


        Box<Cat> catBox = new Box<>();
        catBox.get();
        Cat catFind = catBox.get();
        System.out.println("catFind = " + catFind);

        Box<Animal> animalBox = new Box<>();
        animalBox.get();
        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + findAnimal);
    }
}
