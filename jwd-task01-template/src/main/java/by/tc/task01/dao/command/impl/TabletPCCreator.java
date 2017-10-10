package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;

import java.util.Map;

/**
 * Created by DNAPC on 09.10.2017.
 */
public class TabletPCCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        TabletPC tabletPC = new TabletPC();
        tabletPC.setDisplayInches(Integer.parseInt((String)applianceLine.get("DISPLAY_INCHES")));
        tabletPC.setBatteryCapacity(Integer.parseInt((String)applianceLine.get("BATTERY_CAPACITY")));
        tabletPC.setColor((String)applianceLine.get("COLOR"));
        tabletPC.setFlashMemoryCapacity(Integer.parseInt((String)applianceLine.get("FLASH_MEMORY_CAPACITY")));
        tabletPC.setMemoryRom(Integer.parseInt((String)applianceLine.get("MEMORY_ROM")));
        return tabletPC;
    }
}
