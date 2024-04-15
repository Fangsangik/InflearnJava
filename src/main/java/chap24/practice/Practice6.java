package chap24.practice;

public class Practice6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        int cnt = 0;
        int indexCnt = str.indexOf(key);

        while (indexCnt > 0) {
            indexCnt = str.indexOf(key, indexCnt + 1);
            cnt++;
        }
        System.out.println(cnt);
    }

}

