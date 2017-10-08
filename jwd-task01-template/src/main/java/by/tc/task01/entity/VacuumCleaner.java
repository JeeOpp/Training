package by.tc.task01.entity;

public class VacuumCleaner extends Appliance{
	private int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private double motorSpeedRegulation;
	private double cleaningWidth;

	public VacuumCleaner(){}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VacuumCleaner)) return false;
        if (!super.equals(o)) return false;

        VacuumCleaner that = (VacuumCleaner) o;

        if (getPowerConsumption() != that.getPowerConsumption()) return false;
        if (Double.compare(that.getMotorSpeedRegulation(), getMotorSpeedRegulation()) != 0) return false;
        if (Double.compare(that.getCleaningWidth(), getCleaningWidth()) != 0) return false;
        if (!getFilterType().equals(that.getFilterType())) return false;
        if (!getBagType().equals(that.getBagType())) return false;
        return getWandType().equals(that.getWandType());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + getPowerConsumption();
        result = 31 * result + getFilterType().hashCode();
        result = 31 * result + getBagType().hashCode();
        result = 31 * result + getWandType().hashCode();
        temp = Double.doubleToLongBits(getMotorSpeedRegulation());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCleaningWidth());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "VacuumCleaner";
    }
}
