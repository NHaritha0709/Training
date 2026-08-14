abstract class PatientData
{
    private int patientId;
    private String patientName;
    private int age;
    private double consultationFee;

    PatientData(int patientId, String patientName,
                int age, double consultationFee)
    {
        if(age <= 0)
        {
            throw new IllegalArgumentException(
                    "Age must be greater than zero");
        }

        if(consultationFee <= 0)
        {
            throw new IllegalArgumentException(
                    "Consultation fee must be greater than zero");
        }

        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
        this.consultationFee = consultationFee;
    }

    public int getPatientId()
    {
        return patientId;
    }

    public String getPatientName()
    {
        return patientName;
    }

    public int getAge()
    {
        return age;
    }

    public double getConsultationFee()
    {
        return consultationFee;
    }

    public abstract double calculateBill();
}

class NormalPatient extends PatientData
{
    NormalPatient(int id, String name, int age, double fee)
    {
        super(id, name, age, fee);
    }

    public double calculateBill()
    {
        return getConsultationFee();
    }
}

class UrgentPatient extends PatientData
{
    UrgentPatient(int id, String name, int age, double fee)
    {
        super(id, name, age, fee);
    }

    public double calculateBill()
    {
        return getConsultationFee() * 1.30;
    }
}

class InsuredPatient extends PatientData
{
    InsuredPatient(int id, String name, int age, double fee)
    {
        super(id, name, age, fee);
    }

    public double calculateBill()
    {
        return getConsultationFee() * 0.80;
    }
}

public class HospitalApplication
{
    public static void main(String[] args)
    {
        try
        {
            PatientData p1 =
                    new NormalPatient(101, "Tejavi", 20, 500);

            PatientData p2 =
                    new UrgentPatient(102, "Rahul", 35, 1000);

            PatientData p3 =
                    new InsuredPatient(103, "Priya", 40, 1500);

            System.out.println("General Patient");
            System.out.println("Patient ID : " + p1.getPatientId());
            System.out.println("Patient Name : " + p1.getPatientName());
            System.out.println("Age : " + p1.getAge());
            System.out.println("Consultation Fee : Rs."
                    + p1.getConsultationFee());
            System.out.println("Final Bill : Rs."
                    + p1.calculateBill());

            System.out.println();

            System.out.println("Emergency Patient");
            System.out.println("Patient ID : " + p2.getPatientId());
            System.out.println("Patient Name : " + p2.getPatientName());
            System.out.println("Age : " + p2.getAge());
            System.out.println("Consultation Fee : Rs."
                    + p2.getConsultationFee());
            System.out.println("Final Bill : Rs."
                    + p2.calculateBill());

            System.out.println();

            System.out.println("Insurance Patient");
            System.out.println("Patient ID : " + p3.getPatientId());
            System.out.println("Patient Name : " + p3.getPatientName());
            System.out.println("Age : " + p3.getAge());
            System.out.println("Consultation Fee : Rs."
                    + p3.getConsultationFee());
            System.out.println("Final Bill : Rs."
                    + p3.calculateBill());

            // Invalid patient test
            PatientData invalid =
                    new NormalPatient(104, "Test", 0, 500);
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Exception : " + e.getMessage());
        }
        finally
        {
            System.out.println("Patient billing process completed.");
        }
    }
}
