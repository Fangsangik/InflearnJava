package chap39.practice.deque;

public class BrowserHistoryTest {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory();
        browserHistory.visitPage("youtube.com");
        browserHistory.visitPage("google.com");
        browserHistory.visitPage("facebook.com");

        String curPage = browserHistory.goBack();
        System.out.println("curPage = " + curPage);

        String curPage2 = browserHistory.goBack();
        System.out.println("curPage2 = " + curPage2);
    }
}
