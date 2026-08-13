interface Q18_Flyable {
    void fly();
}

class Q18_Bird implements Q18_Flyable {
    @Override public void fly() { System.out.println("Bird flaps its wings."); }
}
class Q18_Airplane implements Q18_Flyable {
    @Override public void fly() { System.out.println("Airplane uses jet engines."); }
}
class Q18_Drone implements Q18_Flyable {
    @Override public void fly() { System.out.println("Drone spins four rotors."); }
}

public class Q18_CapabilityProblem {
    public static void main(String[] args) {
        Q18_Flyable f;
        f = new Q18_Bird();     f.fly();
        f = new Q18_Airplane(); f.fly();
        f = new Q18_Drone();    f.fly();
    }
}
