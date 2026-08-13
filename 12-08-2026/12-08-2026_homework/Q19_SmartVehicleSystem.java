abstract class Q19_Vehicle {
    protected String brand, model;
    protected double speed;

    public Q19_Vehicle(String brand, String model, double speed) {
        this.brand = brand; this.model = model; this.speed = speed;
    }

    public abstract void start();
}

interface Q19_Chargeable { void chargeBattery(); }
interface Q19_Navigable { void navigateTo(String destination); }
interface Q19_MusicSystem { void playAudio(String track); }

class Q19_ElectricCar extends Q19_Vehicle implements Q19_Chargeable, Q19_Navigable, Q19_MusicSystem {
    public Q19_ElectricCar(String brand, String model, double speed) {
        super(brand, model, speed);
    }

    @Override public void start() { System.out.println(brand + " " + model + " started silently."); }
    @Override public void chargeBattery() { System.out.println("Charging EV battery..."); }
    @Override public void navigateTo(String destination) { System.out.println("Navigating to: " + destination); }
    @Override public void playAudio(String track) { System.out.println("Playing audio: " + track); }
}

public class Q19_SmartVehicleSystem {
    public static void main(String[] args) {
        Q19_ElectricCar tesla = new Q19_ElectricCar("Tesla", "Model S", 120.0);

        Q19_Vehicle v = tesla; v.start();
        Q19_Chargeable c = tesla; c.chargeBattery();
        Q19_Navigable n = tesla; n.navigateTo("Central Park");
        Q19_MusicSystem m = tesla; m.playAudio("Rock Anthem");
    }
}