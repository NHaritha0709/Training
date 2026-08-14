abstract class FoodData
{
    private int orderId;
    private String customerName;
    private String foodName;
    private double price;
    private int quantity;

    FoodData(int orderId, String customerName,
             String foodName, double price, int quantity)
    {
        if(price <= 0)
        {
            throw new IllegalArgumentException(
                    "Price must be greater than zero");
        }

        if(quantity <= 0)
        {
            throw new IllegalArgumentException(
                    "Quantity must be greater than zero");
        }

        this.orderId = orderId;
        this.customerName = customerName;
        this.foodName = foodName;
        this.price = price;
        this.quantity = quantity;
    }

    public int getOrderId()
    {
        return orderId;
    }

    public String getCustomerName()
    {
        return customerName;
    }

    public String getFoodName()
    {
        return foodName;
    }

    public double getPrice()
    {
        return price;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public double getFoodCost()
    {
        return price * quantity;
    }

    public abstract double getDeliveryCharge();

    public double calculateFinalBill()
    {
        return getFoodCost() + getDeliveryCharge();
    }
}

class RegularFood extends FoodData
{
    RegularFood(int id, String customer, String food,
                double price, int quantity)
    {
        super(id, customer, food, price, quantity);
    }

    public double getDeliveryCharge()
    {
        return 50;
    }
}

class QuickFood extends FoodData
{
    QuickFood(int id, String customer, String food,
              double price, int quantity)
    {
        super(id, customer, food, price, quantity);
    }

    public double getDeliveryCharge()
    {
        return 30;
    }
}

class PremiumFood extends FoodData
{
    PremiumFood(int id, String customer, String food,
                double price, int quantity)
    {
        super(id, customer, food, price, quantity);
    }

    public double getDeliveryCharge()
    {
        return 0;
    }
}

public class FoodDeliveryApplication
{
    public static void main(String[] args)
    {
        try
        {
            FoodData f1 =
                    new RegularFood(101, "Tejavi",
                            "Pizza", 250, 2);

            FoodData f2 =
                    new QuickFood(102, "Rahul",
                            "Burger", 150, 3);

            FoodData f3 =
                    new PremiumFood(103, "Priya",
                            "Biryani", 300, 2);

            System.out.println("Regular Food Order");
            System.out.println("Order ID : " + f1.getOrderId());
            System.out.println("Customer Name : " + f1.getCustomerName());
            System.out.println("Food Name : " + f1.getFoodName());
            System.out.println("Price : Rs." + f1.getPrice());
            System.out.println("Quantity : " + f1.getQuantity());
            System.out.println("Food Cost : Rs." + f1.getFoodCost());
            System.out.println("Delivery Charge : Rs."
                    + f1.getDeliveryCharge());
            System.out.println("Final Bill : Rs."
                    + f1.calculateFinalBill());

            System.out.println();

            System.out.println("Fast Food Order");
            System.out.println("Order ID : " + f2.getOrderId());
            System.out.println("Customer Name : " + f2.getCustomerName());
            System.out.println("Food Name : " + f2.getFoodName());
            System.out.println("Price : Rs." + f2.getPrice());
            System.out.println("Quantity : " + f2.getQuantity());
            System.out.println("Food Cost : Rs." + f2.getFoodCost());
            System.out.println("Delivery Charge : Rs."
                    + f2.getDeliveryCharge());
            System.out.println("Final Bill : Rs."
                    + f2.calculateFinalBill());

            System.out.println();

            System.out.println("Premium Food Order");
            System.out.println("Order ID : " + f3.getOrderId());
            System.out.println("Customer Name : " + f3.getCustomerName());
            System.out.println("Food Name : " + f3.getFoodName());
            System.out.println("Price : Rs." + f3.getPrice());
            System.out.println("Quantity : " + f3.getQuantity());
            System.out.println("Food Cost : Rs." + f3.getFoodCost());
            System.out.println("Delivery Charge : Rs."
                    + f3.getDeliveryCharge());
            System.out.println("Final Bill : Rs."
                    + f3.calculateFinalBill());

            System.out.println();

            // Invalid order test
            FoodData invalid =
                    new RegularFood(104, "Test",
                            "Sandwich", 100, 0);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        finally
        {
            System.out.println("Food order processing completed.");
        }
    }
}