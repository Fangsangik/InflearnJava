package chap20.abstractAnimal;

public abstract class AbstractAnimal {

    //추상이 붙은 메서드 => 자식에서 반드시 오버라이딩
    public abstract void sound();

    public void move(){
        System.out.println("동물이 움직인다");
    }
}
