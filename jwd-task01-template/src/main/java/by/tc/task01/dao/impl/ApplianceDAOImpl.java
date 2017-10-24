package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.command.ApplianceDirector;
import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplianceDAOImpl implements ApplianceDAO{

	public <E> Appliance find(Criteria<E> criteria) throws IOException{
        String generic = criteria.getApplianceType();

		ApplianceDirector director = new ApplianceDirector();
		Command applianceCommand = director.getCommand(generic);

		Map<String, Object> parsedLine;

		String path = "src\\main\\resources\\appliances_db.txt";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));

		String applianceLine;
		while ((applianceLine = bufferedReader.readLine())!=null){
            if (generic.equals(applianceLine.split(" ")[0])){
                parsedLine = parseLine(applianceLine);
				if (criteria.subMap(parsedLine)){
				    return applianceCommand.execute(parsedLine);
                }
			}
		}
		return null;
	}



	private Map<String,Object> parseLine(String applianceLine){
	    Map<String,Object> parsedLine = new HashMap<String, Object>();
        Pattern pattern = Pattern.compile("\\s\\S+[=]\\S+[,|;]");
        Matcher matcher = pattern.matcher(applianceLine);

        while (matcher.find()) {
            String criterion = applianceLine.substring(matcher.start()+1, matcher.end() - 1);
            String[] criteria = criterion.split("=");
            parsedLine.put(criteria[0],criteria[1]);
        }
		return parsedLine;
	}
}