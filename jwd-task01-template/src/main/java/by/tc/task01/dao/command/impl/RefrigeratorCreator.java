package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Refrigerator;

import java.util.Map;

/**
 * Created by DNAPC on 09.10.2017.
 */
public class RefrigeratorCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.setWidth(Double.parseDouble((String)applianceLine.get("WIDTH")));
        refrigerator.setWeight(Double.parseDouble((String)applianceLine.get("WEIGHT")));
        refrigerator.setPowerConsumption(Integer.parseInt((String)applianceLine.get("POWER_CONSUMPTION")));
        refrigerator.setHeight(Double.parseDouble((String)applianceLine.get("HEIGHT")));
        refrigerator.setFreezerCapacity(Integer.parseInt((String)applianceLine.get("FREEZER_CAPACITY")));
        refrigerator.setOverallCapacity(Double.parseDouble((String)applianceLine.get("OVERALL_CAPACITY")));
        return refrigerator;
    }
}
