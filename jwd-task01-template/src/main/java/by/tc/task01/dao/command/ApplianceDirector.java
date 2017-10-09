package by.tc.task01.dao.command;

import by.tc.task01.dao.command.impl.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by DNAPC on 09.10.2017.
 */
public class ApplianceDirector {
    private Map<String, Command> commands = new HashMap<String, Command>();

    public ApplianceDirector(){
        commands.put("Laptop",new LaptopCreator());
        commands.put("Oven",new OvenCreator());
        commands.put("Refrigerator", new RefrigeratorCreator());
        commands.put("Speakers", new SpeakersCreator());
        commands.put("TabletPC", new TabletPCCreator());
        commands.put("VacuumCleaner", new VacuumCleanerCreator());
    }

    public Command getCommand(String typeName){
        return commands.get(typeName);
    }
}
