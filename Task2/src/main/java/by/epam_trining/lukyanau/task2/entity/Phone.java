package by.epam_trining.lukyanau.task2.entity;

public class Phone implements ElectricDevice {
    public enum ColorType {
        BLACK,
        WHITE,
        GREY;
    }

    private int batteryCapacity;
    private int romMemory;
    private int systemMemory;
    private ColorType color;

    public Phone(Object... parameters) {
        this.batteryCapacity = (int) parameters[0];
        this.romMemory = (int) parameters[1];
        this.systemMemory = (int) parameters[2];
        this.color = (ColorType) parameters[3];
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
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

    public ColorType getColor() {
        return color;
    }

    public void setColor(ColorType color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Phone phone = (Phone) o;

        if (batteryCapacity != phone.batteryCapacity) return false;
        if (romMemory != phone.romMemory) return false;
        if (systemMemory != phone.systemMemory) return false;
        return color == phone.color;
    }

    @Override
    public int hashCode() {
        int result = batteryCapacity;
        result = 31 * result + romMemory;
        result = 31 * result + systemMemory;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Phone:" +
                "\nbatteryCapacity=" + batteryCapacity +
                "\nromMemory=" + romMemory +
                "\nsystemMemory=" + systemMemory +
                "\ncolor=" + color;
    }

    @Override
    public void start() {
        System.out.println("Phone start working");
    }

    @Override
    public void tierDown() {
        System.out.println("Phone stop working");
    }
}
