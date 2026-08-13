abstract class Q5_Payment {
    protected double amount;

    public Q5_Payment(double amount) {
        this.amount = amount;
    }

    public abstract void makePayment();
}

class Q5_UPIPayment extends Q5_Payment {
    private String upiId;

    public Q5_UPIPayment(double amount, String upiId) {
        super(amount);
        this.upiId = upiId;
    }

    @Override
    public void makePayment() {
        System.out.println("Paid Rs. " + amount + " successfully using UPI ID: " + upiId);
    }
}

class Q5_CreditCardPayment extends Q5_Payment {
    private String cardNumber;

    public Q5_CreditCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Paid Rs. " + amount + " using Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

class Q5_DebitCardPayment extends Q5_Payment {
    private String cardNumber;

    public Q5_DebitCardPayment(double amount, String cardNumber) {
        super(amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void makePayment() {
        System.out.println("Paid Rs. " + amount + " via Debit Card ending in " + cardNumber.substring(cardNumber.length() - 4));
    }
}

public class Q5_PaymentSystem {
    public static void main(String[] args) {
        Q5_Payment upi = new Q5_UPIPayment(1200.50, "user@upi");
        Q5_Payment cc = new Q5_CreditCardPayment(4500.00, "1234567890123456");
        Q5_Payment dc = new Q5_DebitCardPayment(800.00, "9876543210987654");

        upi.makePayment();
        cc.makePayment();
        dc.makePayment();
    }
}