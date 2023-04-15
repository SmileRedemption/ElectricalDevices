import Devices.ElectricalDevice;
import Devices.Kettle;
import Devices.Lamp;
import Devices.TV;
import Room.Flat;

public class Main {
    public static void main(String[] args) {
        ElectricalDevice kettle1 = new Kettle("Sony Kettle", 100);
        ElectricalDevice kettle2 = new Kettle("Samsung Kettle", 120);
        ElectricalDevice TV = new TV("Samsung TV", 200, 40);
        ElectricalDevice lamp = new Lamp("Light Lamp", 80, 100);

        Flat flat =  new Flat();
        flat.addDevice(kettle1);
        flat.addDevice(kettle2);
        flat.addDevice(TV);
        flat.addDevice(lamp);

        System.out.println("Show electrical device in Flat: ");
        flat.showDevices();;
        System.out.println();
        System.out.println("Turn on TV and lamp");
        flat.turnOnDevice(TV.getName());
        flat.turnOnDevice(lamp.getName());
        flat.showDevices();;
        System.out.println();
        System.out.println("The sum of power consumption: " + flat.getTotalPowerConsumption());
        System.out.println();
        System.out.println("Turn off Lamp and turn on Sony Kettle");
        flat.turnOffDevice(lamp.getName());
        flat.turnOnDevice(kettle1.getName());
        flat.showDevices();
        System.out.println("The sum of power consumption: " + flat.getTotalPowerConsumption());
        System.out.println();
        System.out.println("Sort electrical devices: ");
        flat.sortByPowerConsumption();
        flat.showDevices();
        System.out.println();
        System.out.println("Find electrical device between: 110 and 150");
        ElectricalDevice electricalDevice = flat.getElectricalWithPowerConsumptionBetween(110, 150);
        electricalDevice.show();
        System.out.println();
    }
}
