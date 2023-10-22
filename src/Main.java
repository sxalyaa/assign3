
interface Shape {
    void draw();
}

class Rectangle {
    void drawRectangle() {
        System.out.println("Drawing a rectangle");
    }
}

class RectangleAdapter implements Shape {
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    public void draw() {
        rectangle.drawRectangle();
    }
}

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        Shape rectangleAdapter = new RectangleAdapter(rectangle);
        rectangleAdapter.draw();
    }
}
