package Devices;

public class Kettle extends ElectricalDevice {
    public Kettle(String name, int powerConsumption) {
        super(name, powerConsumption);
    }

    @Override
    public void show() {
        System.out.println("Kettle: Name - " + getName() + " Power Consumption: " + getPowerConsumption() + " Is turn on: " + isTurnOn());
    }
}
