class Person {
    String name = "John";
    int age = 25;

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int employeeId = 101;

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.displayPerson();
        e.displayEmployee();
    }
}