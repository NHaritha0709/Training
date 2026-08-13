abstract class Q9_Course {
    protected String courseId;
    protected String courseName;
    protected String instructor;
    protected double baseFee;

    public Q9_Course(String courseId, String courseName, String instructor, double baseFee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.baseFee = baseFee;
    }

    public abstract double calculateFee();

    public void displayCourseDetails() {
        System.out.println("[" + courseId + "] " + courseName + " by " + instructor);
        System.out.println("Base Fee: Rs. " + baseFee + " | Final Fee: Rs. " + calculateFee());
        System.out.println("----------------------------------------------");
    }
}

class Q9_ProgrammingCourse extends Q9_Course {
    public Q9_ProgrammingCourse(String courseId, String courseName, String instructor, double baseFee) {
        super(courseId, courseName, instructor, baseFee);
    }

    @Override
    public double calculateFee() {
        return baseFee + 500;
    }
}

class Q9_DataScienceCourse extends Q9_Course {
    public Q9_DataScienceCourse(String courseId, String courseName, String instructor, double baseFee) {
        super(courseId, courseName, instructor, baseFee);
    }

    @Override
    public double calculateFee() {
        return baseFee + 2000;
    }
}
class Q9_CloudComputingCourse extends Q9_Course {
    public Q9_CloudComputingCourse(String courseId, String courseName, String instructor, double baseFee) {
        super(courseId, courseName, instructor, baseFee);
    }
    @Override
    public double calculateFee() {
        return baseFee + 1500;
    }
}
public class Q9_CoursePlatform {
    public static void main(String[] args) {
        Q9_Course c1 = new Q9_ProgrammingCourse("CS101", "Java OOP", "Prof. Ian", 5000);
        Q9_Course c2 = new Q9_DataScienceCourse("DS201", "Python ML", "Dr. Julia", 8000);
        Q9_Course c3 = new Q9_CloudComputingCourse("CC301", "AWS Architect", "Eng. Kevin", 7000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();
        c3.displayCourseDetails();
    }
}
