abstract class ProductData
{
    private int productId;
    private String productName;
    private double price;

    ProductData(int productId, String productName, double price)
    {
        if(price <= 0)
        {
            throw new IllegalArgumentException(
                    "Product price must be greater than zero");
        }

        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId()
    {
        return productId;
    }

    public String getProductName()
    {
        return productName;
    }

    public double getPrice()
    {
        return price;
    }

    public abstract double calculateDiscount();
}

class ElectronicItem extends ProductData
{
    ElectronicItem(int id, String name, double price)
    {
        super(id, name, price);
    }

    public double calculateDiscount()
    {
        return getPrice() * 0.10;
    }
}

class ClothingItem extends ProductData
{
    ClothingItem(int id, String name, double price)
    {
        super(id, name, price);
    }

    public double calculateDiscount()
    {
        return getPrice() * 0.20;
    }
}

class GroceryItem extends ProductData
{
    GroceryItem(int id, String name, double price)
    {
        super(id, name, price);
    }

    public double calculateDiscount()
    {
        return getPrice() * 0.05;
    }
}

public class ShoppingApplication
{
    public static void main(String[] args)
    {
        try
        {
            ProductData p1 =
                    new ElectronicItem(101, "Laptop", 50000);

            ProductData p2 =
                    new ClothingItem(102, "Shirt", 2000);

            ProductData p3 =
                    new GroceryItem(103, "Rice", 1000);

            System.out.println("Electronics");
            System.out.println("Product ID : " + p1.getProductId());
            System.out.println("Product Name : " + p1.getProductName());
            System.out.println("Original Price : Rs." + p1.getPrice());
            System.out.println("Discount : Rs." + p1.calculateDiscount());
            System.out.println("Final Price : Rs."
                    + (p1.getPrice() - p1.calculateDiscount()));

            System.out.println();

            System.out.println("Clothing");
            System.out.println("Product ID : " + p2.getProductId());
            System.out.println("Product Name : " + p2.getProductName());
            System.out.println("Original Price : Rs." + p2.getPrice());
            System.out.println("Discount : Rs." + p2.calculateDiscount());
            System.out.println("Final Price : Rs."
                    + (p2.getPrice() - p2.calculateDiscount()));

            System.out.println();

            System.out.println("Grocery");
            System.out.println("Product ID : " + p3.getProductId());
            System.out.println("Product Name : " + p3.getProductName());
            System.out.println("Original Price : Rs." + p3.getPrice());
            System.out.println("Discount : Rs." + p3.calculateDiscount());
            System.out.println("Final Price : Rs."
                    + (p3.getPrice() - p3.calculateDiscount()));
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        finally
        {
            System.out.println("Product processing completed.");
        }
    }
}