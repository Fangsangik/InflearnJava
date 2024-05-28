package chap32.practice.practice1;

public class UnitPrinterTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린 ", 40));

        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 30));

        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿" , 150));

        UnitPrinter.printV1(shuttle1);
        UnitPrinter.printV2(shuttle1);
    }
}
