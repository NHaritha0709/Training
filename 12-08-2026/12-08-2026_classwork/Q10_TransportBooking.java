abstract class Q10_Transport {
    protected String source;
    protected String destination;
    protected double baseFare;

    public Q10_Transport(String source, String destination, double baseFare) {
        this.source = source;
        this.destination = destination;
        this.baseFare = baseFare;
    }

    public abstract double calculateFare();

    public void displayTicket() {
        System.out.println("Route: " + source + " -> " + destination + " | Final Fare: Rs. " + calculateFare());
    }
}

class Q10_Bus extends Q10_Transport {
    public Q10_Bus(String source, String destination, double baseFare) {
        super(source, destination, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + 50;
    }
}

class Q10_Train extends Q10_Transport {
    public Q10_Train(String source, String destination, double baseFare) {
        super(source, destination, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + 120;
    }
}

class Q10_Flight extends Q10_Transport {
    public Q10_Flight(String source, String destination, double baseFare) {
        super(source, destination, baseFare);
    }

    @Override
    public double calculateFare() {
        return baseFare + (baseFare * 0.18) + 300;
    }
}

public class Q10_TransportBooking {
    public static void main(String[] args) {
        Q10_Transport t1 = new Q10_Bus("City A", "City B", 300);
        Q10_Transport t2 = new Q10_Train("City A", "City C", 500);
        Q10_Transport t3 = new Q10_Flight("City A", "City D", 4000);

        t1.displayTicket();
        t2.displayTicket();
        t3.displayTicket();
    }
}
