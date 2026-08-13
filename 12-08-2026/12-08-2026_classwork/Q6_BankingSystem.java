abstract class Q6_Account {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public Q6_Account(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(accountHolderName + " deposited Rs. " + amount + ". Balance: Rs. " + balance);
        }
    }

    public abstract boolean withdraw(double amount);

    public void displayAccountInfo() {
        System.out.println("Acc No: " + accountNumber + " | Name: " + accountHolderName + " | Balance: Rs. " + balance);
    }
}

class Q6_SavingsAccount extends Q6_Account {
    private static final double MINIMUM_BALANCE = 1000.0;

    public Q6_SavingsAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance - amount >= MINIMUM_BALANCE) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew Rs. " + amount + ". Remaining Balance: Rs. " + balance);
            return true;
        } else {
            System.out.println("Withdrawal Failed for " + accountHolderName + "! Must maintain minimum balance of Rs. " + MINIMUM_BALANCE);
            return false;
        }
    }
}

class Q6_CurrentAccount extends Q6_Account {
    private double overdraftLimit;

    public Q6_CurrentAccount(String accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew Rs. " + amount + ". Current Balance: Rs. " + balance);
            return true;
        } else {
            System.out.println("Withdrawal Failed for " + accountHolderName + "! Exceeds overdraft limit.");
            return false;
        }
    }
}

public class Q6_BankingSystem {
    public static void main(String[] args) {
        Q6_Account sa = new Q6_SavingsAccount("SA101", "Charlie", 2000);
        Q6_Account ca = new Q6_CurrentAccount("CA102", "Delta Corp", 5000, 10000);

        sa.displayAccountInfo();
        sa.withdraw(1500); // Fails
        sa.withdraw(500);  // Succeeds

        System.out.println("---");

        ca.displayAccountInfo();
        ca.withdraw(12000); // Uses overdraft
    }
}