package chap12.practice1;

public class Rectangle {
    public int width;
    public int height;
    public int area;

    public int calculateArea(int width, int height) {
        return width * height;
    }

    public int calculatePerimeter(int width, int height){
        return 2 * (width + height);
    }

    public boolean isSquare(int width, int height){
        if (width == height){
            return true;
        }
        return false;
    }
}
