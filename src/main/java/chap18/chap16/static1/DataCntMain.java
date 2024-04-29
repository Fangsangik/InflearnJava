package chap18.chap16.static1;

public class DataCntMain {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("data1.getCnt() = " + data1.getCnt());
        
        Data1 data2 = new Data1("B");
        System.out.println("data2.getCnt() = " + data2.getCnt());
        
        Data1 data3 = new Data1("C");
        System.out.println("data3.getCnt() = " + data3.getCnt());
    }
}
