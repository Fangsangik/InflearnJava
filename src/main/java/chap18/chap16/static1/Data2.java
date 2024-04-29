package chap18.chap16.static1;

public class Data2 {
    private String name;

    public Data2(String name, Counter counter){
        this.name = name;
        counter.cnt++;
    }
}
