abstract class Q2_Employee {
    protected int empId;
    protected String name;
    protected double basicSalary;

    public Q2_Employee(int empId, String name, double basicSalary) {
        this.empId = empId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + empId + " | Name: " + name + " | Final Salary: Rs. " + calculateSalary());
    }
}

class Q2_Developer extends Q2_Employee {
    private double bonus;

    public Q2_Developer(int empId, String name, double basicSalary, double bonus) {
        super(empId, name, basicSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + bonus;
    }
}

class Q2_Tester extends Q2_Employee {
    private double testingAllowance;

    public Q2_Tester(int empId, String name, double basicSalary, double testingAllowance) {
        super(empId, name, basicSalary);
        this.testingAllowance = testingAllowance;
    }

    @Override
    public double calculateSalary() {
        return basicSalary + testingAllowance;
    }
}

public class Q2_EmployeeSystem {
    public static void main(String[] args) {
        Q2_Employee dev = new Q2_Developer(101, "Alice", 60000, 15000);
        Q2_Employee tester = new Q2_Tester(102, "Bob", 45000, 8000);

        dev.displayDetails();
        tester.displayDetails();
    }
}