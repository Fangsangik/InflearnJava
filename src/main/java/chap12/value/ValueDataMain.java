package chap12.value;

public class ValueDataMain {
    public static void main(String[] args) {
        Value value = new Value();
        add(value);
        add(value);
        add(value);

        System.out.println("value = " + value.val);
    }

    static void add(Value value){
        value.val++;
        System.out.println("value.val = " + value.val);
    }
}
