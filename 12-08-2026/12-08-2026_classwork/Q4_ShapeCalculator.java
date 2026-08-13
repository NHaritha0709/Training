abstract class Q4_Shape {
    public abstract double calculateArea();
}
class Q4_Circle extends Q4_Shape {
    private double radius;

    public Q4_Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Q4_Rectangle extends Q4_Shape {
    private double length;
    private double width;

    public Q4_Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Q4_Triangle extends Q4_Shape {
    private double base;
    private double height;

    public Q4_Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class Q4_ShapeCalculator {
    public static void main(String[] args) {
        Q4_Shape circle = new Q4_Circle(5.0);
        Q4_Shape rectangle = new Q4_Rectangle(4.0, 6.0);
        Q4_Shape triangle = new Q4_Triangle(3.0, 7.0);

        System.out.printf("Circle Area: %.2f\n", circle.calculateArea());
        System.out.printf("Rectangle Area: %.2f\n", rectangle.calculateArea());
        System.out.printf("Triangle Area: %.2f\n", triangle.calculateArea());
    }
}
