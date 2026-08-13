interface Q13_Payment {
    void pay();
    void refund();
}

abstract class Q13_Transaction {
    protected String transactionId;
    protected double amount;

    public Q13_Transaction(String transactionId, double amount) {
        this.transactionId = transactionId;
        this.amount = amount;
    }

    public void displayTxDetails() {
        System.out.println("Transaction ID: " + transactionId + " | Amount: Rs. " + amount);
    }
}

class Q13_UPIPayment extends Q13_Transaction implements Q13_Payment {
    private String vpa;

    public Q13_UPIPayment(String transactionId, double amount, String vpa) {
        super(transactionId, amount);
        this.vpa = vpa;
    }

    @Override
    public void pay() {
        displayTxDetails();
        System.out.println("Processing UPI payment via VPA: " + vpa);
    }

    @Override
    public void refund() {
        System.out.println("Refunding Rs. " + amount + " instantly to VPA: " + vpa);
    }
}

class Q13_CreditCardPayment extends Q13_Transaction implements Q13_Payment {
    private String cardNumber;

    public Q13_CreditCardPayment(String transactionId, double amount, String cardNumber) {
        super(transactionId, amount);
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        displayTxDetails();
        System.out.println("Processing Credit Card authorization for account " + cardNumber);
    }

    @Override
    public void refund() {
        System.out.println("Refunding Rs. " + amount + " to Credit Card within 3-5 business days.");
    }
}

class Q13_NetBankingPayment extends Q13_Transaction implements Q13_Payment {
    private String bankName;

    public Q13_NetBankingPayment(String transactionId, double amount, String bankName) {
        super(transactionId, amount);
        this.bankName = bankName;
    }

    @Override
    public void pay() {
        displayTxDetails();
        System.out.println("Redirecting to " + bankName + " NetBanking gateway...");
    }

    @Override
    public void refund() {
        System.out.println("Refunding Rs. " + amount + " back to bank account.");
    }
}

public class Q13_PaymentArchitecture {
    public static void main(String[] args) {
        Q13_Payment p;

        p = new Q13_UPIPayment("TXN1001", 1500.0, "user@okaxis");
        p.pay(); p.refund();

        System.out.println("---");

        p = new Q13_CreditCardPayment("TXN1002", 9900.0, "4111-XXXX-XXXX-1111");
        p.pay(); p.refund();

        System.out.println("---");

        p = new Q13_NetBankingPayment("TXN1003", 450.0, "HDFC Bank");
        p.pay(); p.refund();
    }
}