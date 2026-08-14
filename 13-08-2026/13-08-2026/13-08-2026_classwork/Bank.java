class BankAccount
{
    private double balance;

    public  void deposit(double amount)
    {
        if(amount <=0)
        {
            System.out.println("Invalid Amount");
            return;
        }
        balance+=amount;
        System.out.println("Rs."+amount+" deposited successfully");
    }
    public void withdraw(double amount)
    {
        if(amount <=0)
        {
            System.out.println("Invalid Amount");
            return;
        }
        else if(amount>balance)
        {
            System.out.println("Un acc laiye avalo amount illa da!!!");
        }
        else
        {
            balance-=amount;
            System.out.println("Rs."+amount+" withdrawn successfully");

        }
    }
    public double getBalance()
    {
        return balance;
    }
}
public class Bank
{
    public static void main(String[] args)
    {
        BankAccount account = new BankAccount();

        System.out.println("Initial Balance : Rs."+account.getBalance());
        account.deposit(10000);
        System.out.println("Current Balance : Rs."+account.getBalance());
        account.withdraw(3000);
        System.out.println("Current Balance : Rs."+account.getBalance());
        account.withdraw(8000);

        account.deposit(-500);
        System.out.println("Final Balance : Rs."+account.getBalance());
    }
}