package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;

import java.util.Map;

/**
 * Created by DNAPC on 09.10.2017.
 */
public interface Command {
    Appliance execute(Map<String, Object> applianceLine);
}
