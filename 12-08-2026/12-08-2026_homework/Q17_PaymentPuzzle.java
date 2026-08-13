abstract class Q17_Payment {
    abstract void pay();
}

class Q17_UPI extends Q17_Payment {
    @Override void pay() { System.out.println("UPI Payment Completed."); }
    void scanQR() { System.out.println("Scanning QR Code..."); }
}

public class Q17_PaymentPuzzle {
    public static void main(String[] args) {
        Q17_Payment p = new Q17_UPI();
        p.pay();

        if (p instanceof Q17_UPI) {
            Q17_UPI upi = (Q17_UPI) p; // Explicit Downcast
            upi.scanQR();
        }
    }
}