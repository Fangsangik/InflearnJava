package chap39.practice.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {
    Deque<String> deque = new ArrayDeque<>();
    private String curPage = null;

    public void visitPage(String site) {

        if (curPage != null) {
            deque.add(curPage);
        }

        curPage = site;
        System.out.println("방문 : " + site);
    }

    public String goBack() {
        if (!deque.isEmpty()){
            System.out.println("뒤로가기 : " + curPage);
            return curPage;
        }
        return null;
    }
}
