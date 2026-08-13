abstract class Q8_HospitalStaff {
    protected String name;
    protected int empId;
    protected String department;

    public Q8_HospitalStaff(String name, int empId, String department) {
        this.name = name;
        this.empId = empId;
        this.department = department;
    }

    public abstract void performDuty();

    public void displayProfile() {
        System.out.println("Staff ID: " + empId + " | Name: " + name + " | Dept: " + department);
    }
}

class Q8_Doctor extends Q8_HospitalStaff {
    public Q8_Doctor(String name, int empId, String department) {
        super(name, empId, department);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " (Doctor) is diagnosing patients and performing surgeries.");
    }
}

class Q8_Nurse extends Q8_HospitalStaff {
    public Q8_Nurse(String name, int empId, String department) {
        super(name, empId, department);
    }

    @Override
    public void performDuty() {
        System.out.println(name + " (Nurse) is administering medications and caring for ward patients.");
    }
}

class Q8_Pharmacist extends Q8_HospitalStaff {
    public Q8_Pharmacist(String name, int empId, String department) {
        super(name, empId, department);
    }
    @Override
    public void performDuty() {
        System.out.println(name + " (Pharmacist) is dispensing prescribed medicines and managing inventory.");
    }
}
public class Q8_HospitalManagement {
    public static void main(String[] args) {
        Q8_HospitalStaff doc = new Q8_Doctor("Dr. Sarah", 201, "Cardiology");
        Q8_HospitalStaff nurse = new Q8_Nurse("George", 202, "ICU");
        Q8_HospitalStaff pharma = new Q8_Pharmacist("Hannah", 203, "Pharmacy");

        Q8_HospitalStaff[] staffList = { doc, nurse, pharma };

        for (Q8_HospitalStaff staff : staffList) {
            staff.displayProfile();
            staff.performDuty();
            System.out.println();
        }
    }
}
