package q4;

class Person {
    void displayPerson() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void displayEmployee() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void displayManager() {
        System.out.println("Manager");
    }
}

public class Q4 {
    public static void main(String[] args) {
        Manager m = new Manager();

        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}