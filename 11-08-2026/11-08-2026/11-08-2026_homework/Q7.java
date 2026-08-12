package q7;

class Payment {
    void pay() {
        System.out.println("Payment is made");
    }
}

class UPI extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using UPI");
    }
}

class Card extends Payment {
    @Override
    void pay() {
        System.out.println("Payment made using Card");
    }
}

public class Q7 {
    public static void main(String[] args) {
        UPI u = new UPI();
        Card c = new Card();

        u.pay();
        c.pay();
    }
}