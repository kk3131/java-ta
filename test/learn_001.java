package test;

interface Shape {

    double area();
}

class Circle implements Shape {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return radius * radius * 3.14;
    }

}

class Rectangle implements Shape {

    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;

    }

    public double area() {
        return width * height;
    }
}

class ShapePrinter {

    private Shape shape;

    public ShapePrinter(Shape shape) {
        this.shape = shape;
    }

    public void printArea() {
        System.out.println("Area: " + shape.area());
    }
}

public class learn_001 {

    public static void main(String[] args) {
        // 建立 Circle 物件
        Shape circle = new Circle(5);
        ShapePrinter circlePrinter = new ShapePrinter(circle);
        circlePrinter.printArea();  // 輸出 Circle 面積

        // 建立 Rectangle 物件
        Shape rectangle = new Rectangle(4, 6);
        ShapePrinter rectanglePrinter = new ShapePrinter(rectangle);
        rectanglePrinter.printArea();  // 輸出 Rectangle 面積
    }
}
