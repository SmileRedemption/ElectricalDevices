package Comparators;

import Devices.ElectricalDevice;

import java.util.Comparator;

public class PowerConsumptionComparator implements Comparator<ElectricalDevice> {
    @Override
    public int compare(ElectricalDevice o1, ElectricalDevice o2) {
        return o1.compareTo(o2);
    }
}
