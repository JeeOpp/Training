package by.tc.task01.entity;

public class TabletPC extends Appliance{
	private int batteryCapacity;
	private int displayInches;
	private int memoryRom;
	private int flashMemoryCapacity;
	private String color;

	public TabletPC(){}

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public int getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(int displayInches) {
        this.displayInches = displayInches;
    }

    public int getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(int memoryRom) {
        this.memoryRom = memoryRom;
    }

    public int getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(int flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TabletPC)) return false;
        if (!super.equals(o)) return false;

        TabletPC tabletPC = (TabletPC) o;

        if (getBatteryCapacity() != tabletPC.getBatteryCapacity()) return false;
        if (getDisplayInches() != tabletPC.getDisplayInches()) return false;
        if (getMemoryRom() != tabletPC.getMemoryRom()) return false;
        if (getFlashMemoryCapacity() != tabletPC.getFlashMemoryCapacity()) return false;
        return getColor().equals(tabletPC.getColor());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getBatteryCapacity();
        result = 31 * result + getDisplayInches();
        result = 31 * result + getMemoryRom();
        result = 31 * result + getFlashMemoryCapacity();
        result = 31 * result + getColor().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "TabletPC";
    }
}
