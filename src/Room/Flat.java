package Room;

import Comparators.PowerConsumptionComparator;
import Devices.ElectricalDevice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Flat {
    private final List<ElectricalDevice> devices = new ArrayList<>();

    public void addDevice(ElectricalDevice device) {
        devices.add(device);
    }

    public void showDevices(){
        int index = 1;
        for (ElectricalDevice device : devices) {
            System.out.print(index +") ");
            device.show();
            index++;
        }
    }

    public int getTotalPowerConsumption() {
        int totalPowerConsumption = 0;
        for (ElectricalDevice device : devices){
            if (device.isTurnOn()){
                totalPowerConsumption += device.getPowerConsumption();
            }
        }

        return totalPowerConsumption;
    }

    public void sortByPowerConsumption(){
        devices.sort(new PowerConsumptionComparator());
    }

    public ElectricalDevice getElectricalWithPowerConsumptionBetween(int min, int max){
        if (min > max)
            throw new IllegalArgumentException("Wrong parameter min bigger than max");

        for (ElectricalDevice device : devices) {
            if (device.getPowerConsumption() > max)
                continue;
            if (device.getPowerConsumption() < min)
                continue;

            return device;
        }

        throw new IllegalArgumentException("Device between this parameter not exist");
    }

    public void turnOnDevice(String deviceName){
        for (ElectricalDevice device : devices) {
            if (device.getName().equals(deviceName)){
                device.TurnOn();
            }
        }
    }

    public void turnOffDevice(String deviceName){
        for (ElectricalDevice device : devices) {
            if (device.getName().equals(deviceName)){
                device.TurnOff();
            }
        }
    }
}
