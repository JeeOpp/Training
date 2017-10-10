package by.tc.task01.entity;

public class Speakers extends Appliance{
	private int powerConsumption;
	private int numberOfSpeakers;
	private String frequencyRange;
	private int cordLength;

	public Speakers(){}

    public int getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(int numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public int getCordLength() {
        return cordLength;
    }

    public void setCordLength(int cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Speakers)) return false;
        if (!super.equals(o)) return false;

        Speakers speakers = (Speakers) o;

        if (getPowerConsumption() != speakers.getPowerConsumption()) return false;
        if (getNumberOfSpeakers() != speakers.getNumberOfSpeakers()) return false;
        if (getCordLength() != speakers.getCordLength()) return false;
        return getFrequencyRange().equals(speakers.getFrequencyRange());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getPowerConsumption();
        result = 31 * result + getNumberOfSpeakers();
        result = 31 * result + (getFrequencyRange() != null ? getFrequencyRange().hashCode() : 0);
        result = 31 * result + getCordLength();
        return result;
    }

    @Override
    public String toString() {
        return "Speakers{" +
                "powerConsumption=" + powerConsumption +
                ", numberOfSpeakers=" + numberOfSpeakers +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength=" + cordLength +
                '}';
    }
}
