package by.epam_trining.lukyanau.task2.entity;

public class Laptop implements ElectricDevice {
    public enum TypeOS {
        WINDOWS,
        LINUX,
        MAC_OS;
    }

    private double batteryCapacity;
    private TypeOS operatingSystem;
    private int romMemory;
    private int systemMemory;
    private double cpu;
    private int displayInch;

    public Laptop(Object... parameters) {
        this.batteryCapacity = (double) parameters[0];
        this.operatingSystem = (TypeOS) parameters[1];
        this.romMemory = (int) parameters[2];
        this.systemMemory = (int) parameters[3];
        this.cpu = (double) parameters[4];
        this.displayInch = (int) parameters[5];
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public TypeOS getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(TypeOS operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getRomMemory() {
        return romMemory;
    }

    public void setRomMemory(int romMemory) {
        this.romMemory = romMemory;
    }

    public int getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(int systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public int getDisplayInch() {
        return displayInch;
    }

    public void setDisplayInch(int displayInch) {
        this.displayInch = displayInch;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Laptop laptop = (Laptop) o;

        if (Double.compare(laptop.batteryCapacity, batteryCapacity) != 0) return false;
        if (romMemory != laptop.romMemory) return false;
        if (systemMemory != laptop.systemMemory) return false;
        if (Double.compare(laptop.cpu, cpu) != 0) return false;
        if (displayInch != laptop.displayInch) return false;
        return operatingSystem == laptop.operatingSystem;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(batteryCapacity);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (operatingSystem != null ? operatingSystem.hashCode() : 0);
        result = 31 * result + romMemory;
        result = 31 * result + systemMemory;
        temp = Double.doubleToLongBits(cpu);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + displayInch;
        return result;
    }

    @Override
    public String toString() {
        return "Laptop:" +
                "\nbatteryCapacity=" + batteryCapacity +
                "\noperatingSystem=" + operatingSystem +
                "\nromMemory=" + romMemory +
                "\nsystemMemory=" + systemMemory +
                "\ncpu=" + cpu +
                "\ndisplayInch=" + displayInch;
    }

    @Override
    public void start() {
        System.out.println("Laptop start working");
    }

    @Override
    public void tierDown() {
        System.out.println("Laptop stop working");
    }
}
