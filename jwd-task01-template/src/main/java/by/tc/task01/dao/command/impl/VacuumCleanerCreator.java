package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.VacuumCleaner;

import java.util.Map;

/**
 * Created by DNAPC on 09.10.2017.
 */
public class VacuumCleanerCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        VacuumCleaner vacuumCleaner = new VacuumCleaner();
        vacuumCleaner.setPowerConsumption(Integer.parseInt((String)applianceLine.get("POWER_CONSUMPTION")));
        vacuumCleaner.setBagType((String)applianceLine.get("BAG_TYPE"));
        vacuumCleaner.setCleaningWidth(Double.parseDouble((String)applianceLine.get("WIDTH")));
        vacuumCleaner.setFilterType((String)applianceLine.get("FILTER_TYPE"));
        vacuumCleaner.setMotorSpeedRegulation(Double.parseDouble((String)applianceLine.get("MOTOR_SPEED_REGULATION")));
        vacuumCleaner.setWandType((String)applianceLine.get("WAND_TYPE"));
        return vacuumCleaner;
    }
}
