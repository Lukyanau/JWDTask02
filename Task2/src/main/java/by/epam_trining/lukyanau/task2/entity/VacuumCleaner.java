package by.epam_trining.lukyanau.task2.entity;

public class VacuumCleaner implements ElectricDevice {
    public enum TypeFilter {
        A,
        B,
        C;
    }

    private int powerConsumption;
    private TypeFilter filterType;
    private int motorSpeedRegulation;
    private int cleaningWidth;

    public VacuumCleaner(Object... parameters) {
        this.powerConsumption = (int) parameters[0];
        this.filterType = (TypeFilter) parameters[1];
        this.motorSpeedRegulation = (int) parameters[2];
        this.cleaningWidth = (int) parameters[3];
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public TypeFilter getFilterType() {
        return filterType;
    }

    public void setFilterType(TypeFilter filterType) {
        this.filterType = filterType;
    }

    public int getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(int motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public int getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(int cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (powerConsumption != that.powerConsumption) return false;
        if (motorSpeedRegulation != that.motorSpeedRegulation) return false;
        if (cleaningWidth != that.cleaningWidth) return false;
        return filterType == that.filterType;
    }

    @Override
    public int hashCode() {
        int result = powerConsumption;
        result = 31 * result + (filterType != null ? filterType.hashCode() : 0);
        result = 31 * result + motorSpeedRegulation;
        result = 31 * result + cleaningWidth;
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleaner:" +
                "\npowerConsumption=" + powerConsumption +
                "\nfilterType=" + filterType +
                "\nmotorSpeedRegulation=" + motorSpeedRegulation +
                "\ncleaningWidth=" + cleaningWidth;
    }

    @Override
    public void start() {
        System.out.println("VacuumCleaner start working");
    }

    @Override
    public void tierDown() {
        System.out.println("VacuumCleaner stop working");
    }
}
