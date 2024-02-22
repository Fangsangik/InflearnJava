package chap10.movieReview;

public class ReviewMain {
    public static void main(String[] args) {
        Review review = new Review();
        review.title = "인셉션";
        review.review ="인생은 무한 루프";

        Review review1 = new Review();
        review1.title = "어바웃 타입";
        review1.review = "인셍 시간 영화";

        Review[] reviews = {review, review1};
        for (int i = 0; i < reviews.length; i++) {
            Review r = reviews[i];
            System.out.println("영화 제목 : " + r.title
            + " 리뷰 : " + r.review);
        }

        for (Review r:
             reviews) {
            System.out.println("영화 제목 : " + r.title
                    + " 리뷰 : " + r.review);
        }

    }
}
