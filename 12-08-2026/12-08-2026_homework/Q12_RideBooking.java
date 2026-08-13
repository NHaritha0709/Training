abstract class Q12_Ride {
    protected String rideId;
    protected String driverName;
    protected double distance;

    public Q12_Ride(String rideId, String driverName, double distance) {
        this.rideId = rideId;
        this.driverName = driverName;
        this.distance = distance;
    }

    public abstract double calculateFare();

    public void displayRideDetails() {
        System.out.println("Ride #" + rideId + " | Driver: " + driverName + " | Distance: " + distance + " km");
        System.out.println("Total Fare: Rs. " + calculateFare());
        System.out.println("----------------------------------------------");
    }
}

class Q12_BikeRide extends Q12_Ride {
    public Q12_BikeRide(String rideId, String driverName, double distance) {
        super(rideId, driverName, distance);
    }

    @Override
    public double calculateFare() {
        return distance * 10;
    }
}

class Q12_AutoRide extends Q12_Ride {
    public Q12_AutoRide(String rideId, String driverName, double distance) {
        super(rideId, driverName, distance);
    }

    @Override
    public double calculateFare() {
        return distance * 15;
    }
}

class Q12_CarRide extends Q12_Ride {
    public Q12_CarRide(String rideId, String driverName, double distance) {
        super(rideId, driverName, distance);
    }

    @Override
    public double calculateFare() {
        return distance * 20;
    }
}

public class Q12_RideBooking {
    public static void main(String[] args) {
        Q12_Ride currentRide;

        currentRide = new Q12_BikeRide("R001", "Liam", 8.5);
        currentRide.displayRideDetails();

        currentRide = new Q12_AutoRide("R002", "Mason", 8.5);
        currentRide.displayRideDetails();

        currentRide = new Q12_CarRide("R003", "Noah", 8.5);
        currentRide.displayRideDetails();
    }
}