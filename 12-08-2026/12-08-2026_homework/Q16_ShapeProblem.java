abstract class Q16_Shape {
    public abstract double calculateArea();
}

class Q16_Circle extends Q16_Shape {
    private double radius;
    public Q16_Circle(double radius) { this.radius = radius; }
    @Override public double calculateArea() { return Math.PI * radius * radius; }
}

class Q16_Rectangle extends Q16_Shape {
    private double length, width;
    public Q16_Rectangle(double length, double width) { this.length = length; this.width = width; }
    @Override public double calculateArea() { return length * width; }
}

class Q16_Square extends Q16_Shape {
    private double side;
    public Q16_Square(double side) { this.side = side; }
    @Override public double calculateArea() { return side * side; }
}

public class Q16_ShapeProblem {
    public static void main(String[] args) {
        Q16_Shape[] shapes = { new Q16_Circle(3), new Q16_Rectangle(4, 5), new Q16_Square(4) };
        for (Q16_Shape s : shapes) {
            System.out.println("Shape Area: " + s.calculateArea());
        }
    }
}
