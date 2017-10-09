package by.tc.task01.dao.command;

import by.tc.task01.entity.Appliance;

/**
 * Created by DNAPC on 09.10.2017.
 */
public interface Command {
    Appliance execute(String applianceLine);
}
