abstract class StaffDetails
{
    private int employeeId;
    private String employeeName;
    private double basicSalary;

    StaffDetails(int employeeId, String employeeName, double basicSalary)
    {
        if(basicSalary <= 0)
        {
            throw new IllegalArgumentException(
                    "Salary must be greater than zero.");
        }

        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public int getEmployeeId()
    {
        return employeeId;
    }

    public String getEmployeeName()
    {
        return employeeName;
    }

    public double getBasicSalary()
    {
        return basicSalary;
    }

    public abstract double calculateSalary();

    public abstract double calculateAllowance();
}

class PermanentStaff extends StaffDetails
{
    PermanentStaff(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    public double calculateAllowance()
    {
        return getBasicSalary() * 0.20;
    }

    public double calculateSalary()
    {
        return getBasicSalary() + calculateAllowance();
    }
}

class TemporaryStaff extends StaffDetails
{
    TemporaryStaff(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    public double calculateAllowance()
    {
        return getBasicSalary() * 0.10;
    }

    public double calculateSalary()
    {
        return getBasicSalary() + calculateAllowance();
    }
}

class ContractStaff extends StaffDetails
{
    ContractStaff(int id, String name, double salary)
    {
        super(id, name, salary);
    }

    public double calculateAllowance()
    {
        return getBasicSalary() * 0.05;
    }

    public double calculateSalary()
    {
        return getBasicSalary() + calculateAllowance();
    }
}

public class PayrollApplication
{
    public static void main(String[] args)
    {
        try
        {
            StaffDetails e1 =
                    new PermanentStaff(101, "Tejavi", 30000);

            StaffDetails e2 =
                    new TemporaryStaff(102, "Anu", 20000);

            StaffDetails e3 =
                    new ContractStaff(103, "Priya", 25000);

            System.out.println("Permanent Employee");
            System.out.println("Employee ID : " + e1.getEmployeeId());
            System.out.println("Employee Name : " + e1.getEmployeeName());
            System.out.println("Basic Salary : Rs." + e1.getBasicSalary());
            System.out.println("Allowance : Rs." + e1.calculateAllowance());
            System.out.println("Final Salary : Rs." + e1.calculateSalary());

            System.out.println();

            System.out.println("Part-Time Employee");
            System.out.println("Employee ID : " + e2.getEmployeeId());
            System.out.println("Employee Name : " + e2.getEmployeeName());
            System.out.println("Basic Salary : Rs." + e2.getBasicSalary());
            System.out.println("Allowance : Rs." + e2.calculateAllowance());
            System.out.println("Final Salary : Rs." + e2.calculateSalary());

            System.out.println();

            System.out.println("Contract Employee");
            System.out.println("Employee ID : " + e3.getEmployeeId());
            System.out.println("Employee Name : " + e3.getEmployeeName());
            System.out.println("Basic Salary : Rs." + e3.getBasicSalary());
            System.out.println("Allowance : Rs." + e3.calculateAllowance());
            System.out.println("Final Salary : Rs." + e3.calculateSalary());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        finally
        {
            System.out.println("Payroll processing completed.");
        }
    }
}