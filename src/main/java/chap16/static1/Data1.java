package chap16.static1;

public class Data1 {
    private String name;
    private int cnt;

    public Data1(String name){
        this.name = name;
        cnt++;
    }

    public String getName() {
        return name;
    }

    public int getCnt() {
        return cnt;
    }
}
