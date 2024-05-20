package chap32.ex1;

//T는 타입 매개 변수
public class GenericBox<T> {

    private T value;

    public void set(T value){
        this.value = value;
    }

    public T get() {
        return value;
    }
}
