abstract class Product {
    int productId;
    String productName;
    double price;

    Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    abstract double calculateDiscount();

    double calculateFinalPrice() {
        return price - calculateDiscount();
    }

    void displayDetails() {
        System.out.println("ProductId     : " + productId);
        System.out.println("ProductName   : " + productName);
        System.out.println("Price         : " + price);
        System.out.println("Discount      : " + calculateDiscount());
        System.out.println("Final Price   : " + calculateFinalPrice());
    }
}

class Electronics extends Product {

    Electronics(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    double calculateDiscount() {
        return price * 10 / 100;
    }
}

class Clothing extends Product {

    Clothing(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    double calculateDiscount() {
        return price * 20 / 100;
    }
}

class Grocery extends Product {

    Grocery(int productId, String productName, double price) {
        super(productId, productName, price);
    }

    @Override
    double calculateDiscount() {
        return price * 5 / 100;
    }
}

public class Abstraction {
    public static void main(String[] args) {

        // Product reference
        Product p;

        System.out.println("<------------- Electronics ------------->");
        p = new Electronics(123, "Laptop", 55000);
        p.displayDetails();

        System.out.println();

        System.out.println("<------------- Clothing ------------->");
        p = new Clothing(124, "Shirt", 2000);
        p.displayDetails();

        System.out.println();

        System.out.println("<------------- Grocery ------------->");
        p = new Grocery(125, "Rice", 1000);
        p.displayDetails();
    }
}