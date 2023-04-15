package Devices;

public class Lamp extends ElectricalDevice {
    private final int brightness;

    public Lamp(String name, int powerConsumption, int brightness) {
        super(name, powerConsumption);
        this.brightness = brightness;
    }

    @Override
    public void show() {
        System.out.println("Lamp: Name - " + getName() + " Power Consumption: " + getPowerConsumption() + " Brightness: " + brightness + " Is turn on: " + isTurnOn());
    }
}
