package chap20.abstract_and_interface;

public class Bird implements Fly{
    @Override
    public void fly() {
        System.out.println("펄럭");
    }
}
