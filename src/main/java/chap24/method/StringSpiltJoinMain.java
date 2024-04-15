package chap24.method;

public class StringSpiltJoinMain {
    public static void main(String[] args) {
        String str = "Apple,Banana,Orange";

        //split
        String[] strSplit = str.split(",");
        for (String s : strSplit) {
            System.out.println(s);
        }

        //join
        String joinedStr = String.join("-", "A", "B", "C");
        System.out.println(joinedStr);

        //문자열 배열 연결
        String rst = String.join("-" , strSplit);
        System.out.println("rst = " + rst);
    }
}
