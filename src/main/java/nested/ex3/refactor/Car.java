package nested.ex3.refactor;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        //engine을 넘길때 car 넘긴다.
        this.engine = new Engine();
    }

    public String getModel() {
        return model;
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public void start(){
        engine.start();
        System.out.println(model);
    }

    private class Engine {

        //내부 클래스는 바깥 클래스에 접근 가능
        public void start(){
            System.out.println(chargeLevel);
            System.out.println(model);
        }
    }
}
