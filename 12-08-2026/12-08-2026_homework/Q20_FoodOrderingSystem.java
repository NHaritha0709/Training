abstract class Q20_FoodProvider {
    protected String name;
    protected String location;

    public Q20_FoodProvider(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public abstract void prepareFood();
    public abstract double calculateBill(double baseAmount);

    public void displayInfo() {
        System.out.println("Provider: " + name + " | Location: " + location);
    }
}

interface Q20_HomeDeliverable { void deliverOrder(String address); }
interface Q20_OnlinePayable { void processOnlinePayment(double amount); }

class Q20_Restaurant extends Q20_FoodProvider implements Q20_HomeDeliverable, Q20_OnlinePayable {
    public Q20_Restaurant(String name, String location) { super(name, location); }

    @Override public void prepareFood() { System.out.println(name + " preparing gourmet food."); }
    @Override public double calculateBill(double baseAmount) { return baseAmount + (baseAmount * 0.18) + 50.0; }
    @Override public void deliverOrder(String address) { System.out.println("Delivering to: " + address); }
    @Override public void processOnlinePayment(double amount) { System.out.println("Paid online: Rs. " + amount); }
}

class Q20_CloudKitchen extends Q20_FoodProvider implements Q20_HomeDeliverable, Q20_OnlinePayable {
    public Q20_CloudKitchen(String name, String location) { super(name, location); }

    @Override public void prepareFood() { System.out.println(name + " preparing takeaway meals."); }
    @Override public double calculateBill(double baseAmount) { return baseAmount + (baseAmount * 0.05) + 30.0; }
    @Override public void deliverOrder(String address) { System.out.println("Dispatched driver to: " + address); }
    @Override public void processOnlinePayment(double amount) { System.out.println("Gateway received Rs. " + amount); }
}

class Q20_FoodTruck extends Q20_FoodProvider implements Q20_OnlinePayable {
    public Q20_FoodTruck(String name, String location) { super(name, location); }

    @Override public void prepareFood() { System.out.println(name + " cooking quick bites on wheels."); }
    @Override public double calculateBill(double baseAmount) { return baseAmount + (baseAmount * 0.05); }
    @Override public void processOnlinePayment(double amount) { System.out.println("Scanned QR for Rs. " + amount); }
}

public class Q20_FoodOrderingSystem {
    public static void main(String[] args) {
        Q20_FoodProvider[] providers = {
                new Q20_Restaurant("Bistro Delight", "Downtown"),
                new Q20_CloudKitchen("Speedy Eats", "Industrial Zone"),
                new Q20_FoodTruck("Taco Wheels", "Beach Road")
        };

        for (Q20_FoodProvider fp : providers) {
            System.out.println("==================================================");
            fp.displayInfo();
            fp.prepareFood();
            double bill = fp.calculateBill(500.0);
            System.out.println("Total Bill: Rs. " + bill);

            if (fp instanceof Q20_OnlinePayable) {
                ((Q20_OnlinePayable) fp).processOnlinePayment(bill);
            }

            if (fp instanceof Q20_HomeDeliverable) {
                ((Q20_HomeDeliverable) fp).deliverOrder("123 Main Street");
            } else {
                System.out.println("NOTE: " + fp.name + " does NOT support Home Delivery!");
            }
        }
    }
}
