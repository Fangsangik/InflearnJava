package chap12.practice1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        int area = r.calculateArea(5, 8);
        System.out.println("area = " + area);

        int perimeter = r.calculatePerimeter(5, 8);
        System.out.println("perimeter = " + perimeter);

        boolean square = r.isSquare(5, 8);
        System.out.println("square = " + square);
    }
}
