class BankAccount1
{
    static String bankName = "Mariamman Indian Bank";
    private int accountNumber;
    private String accountHolderName;
    private String mobileNumber;
    private String accountType;
    private double balance;
    BankAccount1(int accountNumber, String accountHolderName,
                String mobileNumber, String accountType, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.mobileNumber = mobileNumber;
        this.accountType = accountType;
        this.balance = balance;
    }
    public int getAccountNumber()
    {
        return accountNumber;
    }
    public String getAccountHolderName()
    {
        return accountHolderName;
    }
    public String getMobileNumber()
    {
        return mobileNumber;
    }
    public String getAccountType()
    {
        return accountType;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setMobileNumber(String mobileNumber)
    {
        this.mobileNumber = mobileNumber;
    }

    // Deposit method
    public void deposit(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid deposit amount.");
        }
        else
        {
            balance = balance + amount;
            System.out.println("Rs." + amount + " deposited successfully.");
        }
    }
    public void withdraw(double amount)
    {
        if(amount <= 0)
        {
            System.out.println("Invalid withdrawal amount.");
        }
        else if(amount > balance)
        {
            System.out.println("Insufficient balance.");
        }
        else
        {
            balance = balance - amount;
            System.out.println("Rs." + amount + " withdrawn successfully.");
        }
    }
    public void displayAccountDetails()
    {
        System.out.println("====================================");
        System.out.println("       MARIAMMAN INDIAN BANK");
        System.out.println("====================================");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Balance        : Rs." + balance);
        System.out.println("====================================");
    }
}
public class MariammanIndianBank
{
    public static void main(String[] args)
    {
        BankAccount1 account1 = new BankAccount1(
                1001,
                "Arun",
                "9876543210",
                "Savings",
                25000
        );
        BankAccount1 account2 = new BankAccount1(
                1002,
                "Kumar",
                "9876501234",
                "Current",
                50000
        );
        System.out.println("\nACCOUNT 1 DETAILS");
        account1.displayAccountDetails();
        System.out.println("\n--- Deposit Rs.5000 ---");
        account1.deposit(5000);
        System.out.println("Updated Balance : Rs." + account1.getBalance());
        System.out.println("\n--- Withdraw Rs.3000 ---");
        account1.withdraw(3000);
        System.out.println("Updated Balance : Rs." + account1.getBalance());
        System.out.println("\n--- Updating Mobile Number ---");
        account1.setMobileNumber("9999999999");
        System.out.println("Updated Mobile Number : "
                + account1.getMobileNumber());
        System.out.println("\n--- Negative Deposit ---");
        account1.deposit(-500);
        System.out.println("\n--- Negative Withdrawal ---");
        account1.withdraw(-1000);
        System.out.println("\n--- Excess Withdrawal ---");
        account1.withdraw(50000);
        System.out.println("\n\nACCOUNT 2 DETAILS");
        account2.displayAccountDetails();
        System.out.println("\n--- Deposit Rs.10000 ---");
        account2.deposit(10000);
        System.out.println("\n--- Withdraw Rs.5000 ---");
        account2.withdraw(5000);
        System.out.println("\n--- FINAL ACCOUNT 2 DETAILS ---");
        account2.displayAccountDetails();
        System.out.println("\n--- BANK NAME ---");
        System.out.println("Account 1 Bank : " + BankAccount1.bankName);
        System.out.println("Account 2 Bank : " + BankAccount1.bankName);
    }
}