class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }
}

class AdvancedCalculator extends Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

public class Q3 {
    public static void main(String[] args) {
        AdvancedCalculator c = new AdvancedCalculator();

        System.out.println("Addition: " + c.add(10, 5));
        System.out.println("Subtraction: " + c.subtract(10, 5));
        System.out.println("Multiplication: " + c.multiply(10, 5));
        System.out.println("Division: " + c.divide(10, 5));
    }
}