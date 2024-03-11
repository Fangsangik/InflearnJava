package chap17;

public class ConstMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 " + 1000);
        int curUserCnt = 999;

        process(curUserCnt++);
        process(curUserCnt++);
        process(curUserCnt++);
    }

    private static void process(int curCnt){
        System.out.println("참여자수 " + curCnt);
        if (curCnt > 1000){
            System.out.println("대기자로 등록 합니다");
        } else {
            System.out.println("게임에 참여 합니다 ");
        }
    }
}
