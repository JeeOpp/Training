package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Oven;

import java.util.Map;

/**
 * Created by DNAPC on 09.10.2017.
 */
public class OvenCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        Oven oven = new Oven();
        oven.setCapacity(Integer.parseInt((String)applianceLine.get("CAPACITY")));
        oven.setDepth(Integer.parseInt((String)applianceLine.get("DEPTH")));
        oven.setHeight(Double.parseDouble((String)applianceLine.get("HEIGHT")));
        oven.setPowerConsumption(Integer.parseInt((String)applianceLine.get("POWER_CONSUMPTION")));
        oven.setWeight(Double.parseDouble((String)applianceLine.get("WEIGHT")));
        oven.setWidth(Double.parseDouble((String)applianceLine.get("WIDTH")));
        return oven;
    }
}
