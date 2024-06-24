package chap37;

public class StringHashMain {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';

        //아스키코드로 변경됨
        System.out.println("charA = " + (int)charA);
        System.out.println("charB = " + (int)charB);

        System.out.println();

        //hashCode
        System.out.println("hashCode(\"A\") = " + hashCode("A"));
        System.out.println("hashCode(\"B\") = " + hashCode("B"));
        System.out.println("hashCode(\"AB\") = " + hashCode("AB"));

        System.out.println();

        //hashIndex
        System.out.println("hashIndex(hashCode(\"A\")) = " + hashIndex(hashCode("A")));
        System.out.println("hashIndex(hashCode(\"B\")) = " + hashIndex(hashCode("B")));
        System.out.println("hashIndex(hashCode(\"AB\")) = " + hashIndex(hashCode("AB")));
    }

    //문자가 -> 숫자로 변경됨
    static int hashCode(String str){
        char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c:
             charArray) {
            sum += c;
        }

        return sum;
    }

    //나눈 나머지
    static int hashIndex (int val){
        return val % CAPACITY;
    }
}
