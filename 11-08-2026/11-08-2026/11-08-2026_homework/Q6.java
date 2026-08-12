package q6;

class Account {
    String accountName = "Basic Account";
    double balance = 30000;

    void displayAccount() {
        System.out.println("Account: " + accountName);
        System.out.println("Balance: " + balance);
    }
}

class PremiumAccount extends Account {
    double bonus = 5000;

    void displayTotal() {
        displayAccount();
        System.out.println("Bonus: " + bonus);
        System.out.println("Total: " + (balance + bonus));
    }
}

public class Q6 {
    public static void main(String[] args) {
        PremiumAccount p = new PremiumAccount();
        p.displayTotal();
    }
}