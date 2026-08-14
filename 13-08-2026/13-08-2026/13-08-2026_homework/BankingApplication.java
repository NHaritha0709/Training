class BankTransactionException extends Exception
{
    BankTransactionException(String message)
    {
        super(message);
    }
}

abstract class AccountBase
{
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    AccountBase(int accountNumber, String accountHolderName, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
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

    public double getBalance()
    {
        return balance;
    }

    protected void addBalance(double amount)
    {
        balance += amount;
    }

    protected void reduceBalance(double amount)
    {
        balance -= amount;
    }

    public void deposit(double amount) throws BankTransactionException
    {
        if(amount <= 0)
        {
            throw new BankTransactionException("Invalid deposit amount");
        }

        balance += amount;
        System.out.println("Rs." + amount + " deposited successfully");
    }

    public abstract void withdraw(double amount)
            throws BankTransactionException;
}

class SavingsData extends AccountBase
{
    SavingsData(int accountNumber, String accountHolderName, double balance)
    {
        super(accountNumber, accountHolderName, balance);
    }

    public void withdraw(double amount) throws BankTransactionException
    {
        if(amount <= 0)
        {
            throw new BankTransactionException("Invalid withdrawal amount");
        }

        if(amount > getBalance())
        {
            throw new BankTransactionException("Insufficient balance");
        }

        reduceBalance(amount);
        System.out.println("Rs." + amount + " withdrawn successfully");
    }
}

class CurrentData extends AccountBase
{
    CurrentData(int accountNumber, String accountHolderName, double balance)
    {
        super(accountNumber, accountHolderName, balance);
    }

    public void withdraw(double amount) throws BankTransactionException
    {
        double minimumBalance = 1000;

        if(amount <= 0)
        {
            throw new BankTransactionException("Invalid withdrawal amount");
        }

        if(amount > getBalance() - minimumBalance)
        {
            throw new BankTransactionException(
                    "Minimum balance of Rs.1000 must be maintained");
        }

        reduceBalance(amount);
        System.out.println("Rs." + amount + " withdrawn successfully");
    }
}

public class BankingApplication
{
    public static void main(String[] args)
    {
        AccountBase savings =
                new SavingsData(101, "Tejavi", 5000);

        AccountBase current =
                new CurrentData(102, "Rahul", 8000);

        try
        {
            System.out.println("Savings Account");
            savings.deposit(2000);
            savings.withdraw(3000);
            System.out.println("Final Balance : Rs."
                    + savings.getBalance());

            System.out.println();

            System.out.println("Current Account");
            current.deposit(1000);
            current.withdraw(2000);
            System.out.println("Final Balance : Rs."
                    + current.getBalance());

            current.withdraw(7000);
        }
        catch(BankTransactionException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        finally
        {
            System.out.println("Bank transaction completed.");
        }
    }
}