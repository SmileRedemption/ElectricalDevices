package Devices;

public class TV extends ElectricalDevice {
    private final double diagonal;

    public TV(String name, int powerConsumption, double diagonal) {
        super(name, powerConsumption);
        this.diagonal = diagonal;
    }

    @Override
    public void show() {
        System.out.println("TV: Name - " + getName() + " Power Consumption: " + getPowerConsumption() + " Diagonal: " + diagonal + " Is turn on: " + isTurnOn());
    }
}
