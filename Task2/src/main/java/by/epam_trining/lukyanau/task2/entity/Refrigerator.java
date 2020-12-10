package by.epam_trining.lukyanau.task2.entity;

public class Refrigerator implements ElectricDevice {
    private int powerConsumption;
    private int weight;
    private int freezerCapacity;
    private int overallCapacity;
    private int height;
    private int width;

    public Refrigerator(Object... parameters) {
        this.powerConsumption = (int) parameters[0];
        this.weight = (int) parameters[1];
        this.freezerCapacity = (int) parameters[2];
        this.overallCapacity = (int) parameters[3];
        this.height = (int) parameters[4];
        this.width = (int) parameters[5];
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFreezerCapacity() {
        return freezerCapacity;
    }

    public void setFreezerCapacity(int freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
    }

    public int getOverallCapacity() {
        return overallCapacity;
    }

    public void setOverallCapacity(int overallCapacity) {
        this.overallCapacity = overallCapacity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Refrigerator that = (Refrigerator) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (weight != that.weight) return false;
        if (freezerCapacity != that.freezerCapacity) return false;
        if (overallCapacity != that.overallCapacity) return false;
        if (height != that.height) return false;
        return width == that.width;
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + freezerCapacity;
        result = 31 * result + overallCapacity;
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "Refrigerator:" +
                "\npowerConsumption=" + powerConsumption +
                "\nweight=" + weight +
                "\nfreezerCapacity=" + freezerCapacity +
                "\noverallCapacity=" + overallCapacity +
                "\nheight=" + height +
                "\nwidth=" + width;
    }

    @Override
    public void start() {
        System.out.println("Refrigerator start working");
    }

    @Override
    public void tierDown() {
        System.out.println("Refrigerator stop working");
    }
}
