package by.epam_trining.lukyanau.task2.entity;

public class Oven implements ElectricDevice {
    private int powerConsumption;
    private int weight;
    private int capacity;
    private int depth;
    private int height;
    private int width;

    public Oven(Object... parameters) {
        this.powerConsumption = (int) parameters[0];
        this.weight = (int) parameters[1];
        this.capacity = (int) parameters[2];
        this.depth = (int) parameters[3];
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

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
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
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Oven oven = (Oven) o;

        if (powerConsumption != oven.powerConsumption) {
            return false;
        }
        if (weight != oven.weight) {
            return false;
        }
        if (capacity != oven.capacity) {
            return false;
        }
        if (depth != oven.depth) {
            return false;
        }
        if (height != oven.height) {
            return false;
        }
        return width == oven.width;
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + weight;
        result = 31 * result + capacity;
        result = 31 * result + depth;
        result = 31 * result + height;
        result = 31 * result + width;
        return result;
    }

    @Override
    public String toString() {
        return "Oven:" +
                "\npowerConsumption=" + powerConsumption +
                "\n weight=" + weight +
                "\n capacity=" + capacity +
                "\n depth=" + depth +
                "\n height=" + height +
                "\n width=" + width;
    }

    @Override
    public void start() {
        System.out.println("Oven start working");
    }

    @Override
    public void tierDown() {
        System.out.println("Oven stop working");
    }
}
