package chap32.ex6;

import chap32.animal.Animal;

public class WildcardEx {

    //Box T 라는 값을 받는다.
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.getValue());
    }

    //Box에 상한을 건다.
    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 = " + t.getName());
    }

    //T 타입을 반환
    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.getValue();
        System.out.println("이름 : " + t.getName());
        return t;
    }


    //? -> 아무거나 다 들어 올 수 있다는 의미
    static void printWildcardV1(Box<?> box) {
        System.out.println("? = " + box.getValue());
    }

    //와일드 카드에 뭐가 들어올지 제한 가능
    static void printWildcardV2(Box<? extends Animal> box){
        Animal animal = box.getValue();
        System.out.println("이름 : " + animal.getName());
    }

    static Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal animal = box.getValue();
        System.out.println("이름 = " + animal.getName());
        return animal;
    }
}
