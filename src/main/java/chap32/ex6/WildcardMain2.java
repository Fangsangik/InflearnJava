package chap32.ex6;

import chap32.animal.Animal;
import chap32.animal.Cat;
import chap32.animal.Dog;

public class WildcardMain2 {
    public static void main(String[] args) {
        Box<Object> objectBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        dogBox.setValue(new Dog("멍멍이", 100));

        //Animal 포함 상위 타입 전달 가능
        writeBox(objectBox);
        writeBox(animalBox);

        //하한
//        writeBox(dogBox);
//        writeBox(catBox);

        Animal animal = animalBox.getValue();
        System.out.println("animal = " + animal);
    }

    //super를 사용했기에, Animal 보다 상위 타입이 ?에 들어와야 한다.
    static void writeBox(Box<? super Animal> box) {
        box.setValue(new Dog("멍멍이", 100));
    }
}
