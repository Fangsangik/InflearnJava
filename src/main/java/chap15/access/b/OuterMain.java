package chap15.access.b;

import chap15.access.a.AccessData;

public class OuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public
        data.publicField = 1;
        data.publicMethod();

//        data.defaultField = 2;
//        System.out.println("defaultField = " + defaultField);

        //private은 호출 X

        data.innerAccess();
    }
}

