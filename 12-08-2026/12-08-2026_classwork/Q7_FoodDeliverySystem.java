abstract class Q7_Order {
    protected int orderId;
    protected String customerName;
    protected double foodAmount;

    public Q7_Order(int orderId, String customerName, double foodAmount) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.foodAmount = foodAmount;
    }

    public abstract double calculateDeliveryCharge();

    public void displayBillDetails() {
        double deliveryCharge = calculateDeliveryCharge();
        double totalBill = foodAmount + deliveryCharge;
        System.out.println("Order ID: #" + orderId + " | Customer: " + customerName);
        System.out.println("Food Amount: Rs. " + foodAmount + " | Delivery Charge: Rs. " + deliveryCharge);
        System.out.println("Total Amount Payable: Rs. " + totalBill);
        System.out.println("------------------------------------------");
    }
}

class Q7_NormalDeliveryOrder extends Q7_Order {
    public Q7_NormalDeliveryOrder(int orderId, String customerName, double foodAmount) {
        super(orderId, customerName, foodAmount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return 40.0;
    }
}

class Q7_ExpressDeliveryOrder extends Q7_Order {
    public Q7_ExpressDeliveryOrder(int orderId, String customerName, double foodAmount) {
        super(orderId, customerName, foodAmount);
    }

    @Override
    public double calculateDeliveryCharge() {
        return 90.0;
    }
}

public class Q7_FoodDeliverySystem {
    public static void main(String[] args) {
        Q7_Order ord1 = new Q7_NormalDeliveryOrder(501, "Ethan", 450.0);
        Q7_Order ord2 = new Q7_ExpressDeliveryOrder(502, "Fiona", 450.0);

        ord1.displayBillDetails();
        ord2.displayBillDetails();
    }
}
