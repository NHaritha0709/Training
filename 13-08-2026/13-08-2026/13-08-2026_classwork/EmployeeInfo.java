class EmployeeData
{
    private String name;
    private int age;
    EmployeeData(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    public String getName()
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}

public class EmployeeInfo extends EmployeeData
{
    EmployeeInfo(String name, int age)
    {
        super(name, age);
    }
    public static void main(String[] args)
    {
        EmployeeInfo e = new EmployeeInfo("Haritha", 19);
        System.out.println("Name: " + e.getName());
        System.out.println("Age: " + e.getAge());
    }
}