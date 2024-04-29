package chap18.chap16.static1;

public class DataCntMain3 {
    public static void main(String[] args) {
        Data3 d1 = new Data3("A");
        System.out.println("A cnt = " + Data3.cnt);

        Data3 d2 = new Data3("B");
        System.out.println("B cnt = " + Data3.cnt);

        Data3 d3 = new Data3("C");
        System.out.println("C cnt = " + Data3.cnt);

        //인스턴스를 통한 접근
        Data3 d4 = new Data3("D");
        System.out.println(d4.cnt); //권장하는 방법 X -> 가져다 쓰는 입장에서 햇갈림

        System.out.println(Data3.cnt);
    }
}
