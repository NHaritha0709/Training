abstract class Q11_Product {
    protected String productId;
    protected String name;
    protected double price;

    public Q11_Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public abstract double calculateDiscount();

    public double getFinalPrice() {
        return price - calculateDiscount();
    }

    public void displaySummary() {
        System.out.println("[" + productId + "] " + name);
        System.out.println("Original Price: Rs. " + price + " | Discount: Rs. " + calculateDiscount() + " | Final Price: Rs. " + getFinalPrice());
        System.out.println("-------------------------------------------------------");
    }
}

class Q11_Electronics extends Q11_Product {
    public Q11_Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.10;
    }
}

class Q11_Clothing extends Q11_Product {
    public Q11_Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.20;
    }
}

class Q11_Grocery extends Q11_Product {
    public Q11_Grocery(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }
}

public class Q11_EcommerceSystem {
    public static void main(String[] args) {
        Q11_Product[] cart = {
                new Q11_Electronics("E101", "Smartphone", 30000),
                new Q11_Clothing("C201", "Denim Jacket", 2500),
                new Q11_Grocery("G301", "Organic Honey", 400)
        };

        for (Q11_Product item : cart) {
            item.displaySummary();
        }
    }
}