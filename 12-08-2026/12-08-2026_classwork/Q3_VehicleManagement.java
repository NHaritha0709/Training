abstract class Q3_Vehicle {
    public abstract void start();

    public void stop() {
        System.out.println("Vehicle has come to a complete stop.");
    }
}

class Q3_Car extends Q3_Vehicle {
    @Override
    public void start() {
        System.out.println("Car starts with a push-button ignition.");
    }
}

class Q3_Bike extends Q3_Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a self-start button or kick.");
    }
}

class Q3_Bus extends Q3_Vehicle {
    @Override
    public void start() {
        System.out.println("Bus starts with a heavy diesel engine key turn.");
    }
}

public class Q3_VehicleManagement {
    public static void main(String[] args) {
        Q3_Vehicle car = new Q3_Car();
        Q3_Vehicle bike = new Q3_Bike();
        Q3_Vehicle bus = new Q3_Bus();

        car.start();  car.stop();
        bike.start(); bike.stop();
        bus.start();  bus.stop();
    }
}
