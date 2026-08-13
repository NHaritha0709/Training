interface Q14_Assignable {
    void submitAssignment(String assignmentTitle);
}

abstract class Q14_Student {
    protected int studentId;
    protected String name;
    protected String department;

    public Q14_Student(int studentId, String name, String department) {
        this.studentId = studentId;
        this.name = name;
        this.department = department;
    }

    public abstract double calculateFees();

    public void displayStudent() {
        System.out.println("ID: " + studentId + " | Name: " + name + " | Dept: " + department + " | Fees: Rs. " + calculateFees());
    }
}

class Q14_RegularStudent extends Q14_Student implements Q14_Assignable {
    public Q14_RegularStudent(int studentId, String name, String department) {
        super(studentId, name, department);
    }

    @Override
    public double calculateFees() { return 45000.0; }

    @Override
    public void submitAssignment(String assignmentTitle) {
        System.out.println(name + " (Regular) submitted assignment: " + assignmentTitle);
    }
}

class Q14_DistanceLearningStudent extends Q14_Student implements Q14_Assignable {
    public Q14_DistanceLearningStudent(int studentId, String name, String department) {
        super(studentId, name, department);
    }

    @Override
    public double calculateFees() { return 20000.0; }

    @Override
    public void submitAssignment(String assignmentTitle) {
        System.out.println(name + " (Distance) uploaded assignment to LMS: " + assignmentTitle);
    }
}

class Q14_ResearchScholar extends Q14_Student {
    public Q14_ResearchScholar(int studentId, String name, String department) {
        super(studentId, name, department);
    }

    @Override
    public double calculateFees() { return 10000.0; }
}

public class Q14_UniversitySystem {
    public static void main(String[] args) {
        Q14_Student s1 = new Q14_RegularStudent(1, "Alice", "CSE");
        Q14_Student s2 = new Q14_DistanceLearningStudent(2, "Bob", "ECE");
        Q14_Student s3 = new Q14_ResearchScholar(3, "Dr. Charlie", "Physics");

        Q14_Student[] roster = { s1, s2, s3 };

        for (Q14_Student s : roster) {
            s.displayStudent();
            if (s instanceof Q14_Assignable) {
                ((Q14_Assignable) s).submitAssignment("OOP Mini Project");
            } else {
                System.out.println(s.name + " is exempt from assignment submissions (Research focus).");
            }
            System.out.println("----------------------------------------------");
        }
    }
}
