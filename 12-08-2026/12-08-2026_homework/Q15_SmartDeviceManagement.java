interface Q15_Camera { void takePhoto(); }
interface Q15_InternetEnabled { void connectToInternet(); }
interface Q15_MusicPlayer { void playMusic(); }

abstract class Q15_SmartDevice {
    protected String deviceId;
    protected String brand;
    protected double price;

    public Q15_SmartDevice(String deviceId, String brand, double price) {
        this.deviceId = deviceId;
        this.brand = brand;
        this.price = price;
    }

    public abstract void displaySpecifications();
    public void turnOn() { System.out.println(brand + " device turning ON."); }
    public void turnOff() { System.out.println(brand + " device turning OFF."); }
}

class Q15_SmartPhone extends Q15_SmartDevice implements Q15_Camera, Q15_InternetEnabled, Q15_MusicPlayer {
    public Q15_SmartPhone(String deviceId, String brand, double price) {
        super(deviceId, brand, price);
    }

    @Override
    public void displaySpecifications() {
        System.out.println("SmartPhone ID: " + deviceId + " | Brand: " + brand + " | Price: Rs. " + price);
    }

    @Override public void takePhoto() { System.out.println("Capturing 108MP image."); }
    @Override public void connectToInternet() { System.out.println("Connected via 5G."); }
    @Override public void playMusic() { System.out.println("Playing audio stream."); }
}

class Q15_SmartWatch extends Q15_SmartDevice implements Q15_InternetEnabled, Q15_MusicPlayer {
    public Q15_SmartWatch(String deviceId, String brand, double price) {
        super(deviceId, brand, price);
    }

    @Override
    public void displaySpecifications() {
        System.out.println("SmartWatch ID: " + deviceId + " | Brand: " + brand + " | Price: Rs. " + price);
    }

    @Override public void connectToInternet() { System.out.println("Connected via Wi-Fi."); }
    @Override public void playMusic() { System.out.println("Playing offline saved playlist."); }
}

public class Q15_SmartDeviceManagement {
    public static void main(String[] args) {
        Q15_SmartDevice phone = new Q15_SmartPhone("P1", "Apple", 99900);
        Q15_SmartDevice watch = new Q15_SmartWatch("W1", "Garmin", 25000);

        phone.turnOn();
        phone.displaySpecifications();
        ((Q15_Camera) phone).takePhoto();

        System.out.println("---");

        watch.turnOn();
        watch.displaySpecifications();
        ((Q15_InternetEnabled) watch).connectToInternet();
    }
}