package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

import java.util.Map;

/**
 * Created by DNAPC on 09.10.2017.
 */
public class SpeakersCreator implements Command {
    public Appliance execute(Map<String, Object> applianceLine) {
        return new Speakers();
    }
}
