package Devices;

public abstract class ElectricalDevice implements Comparable<ElectricalDevice>{
    private final String name;
    private final int powerConsumption;
    private boolean isTurnOn;

    public ElectricalDevice(String name, int powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        isTurnOn = false;
    }

    public String getName() {
        return name;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public boolean isTurnOn() {
        return isTurnOn;
    }

    public void TurnOn(){
        isTurnOn = true;
    }

    public void TurnOff(){
        isTurnOn = false;
    }

    public abstract void show();

    @Override
    public int compareTo(ElectricalDevice o) {
        return powerConsumption - o.getPowerConsumption();
    }
}


