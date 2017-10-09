package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.command.ApplianceDirector;
import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class ApplianceDAOImpl implements ApplianceDAO{

	public <E> Appliance find(Criteria<E> criteria) throws IOException{
		ApplianceDirector director = new ApplianceDirector();
		String generic = criteria.getApplianceType();

		Command applianceCommand = director.getCommand(generic);
		String path = "src\\main\\resources\\appliances_db.txt";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));

		String applianceLine;
		while ((applianceLine = bufferedReader.readLine())!=null){

			if (generic.equals(applianceLine.split(" ")[0])){



				if (criteria.isContained(applianceLine)){
					return applianceCommand.execute(applianceLine);
				}
			}
		}
		return null;
	}
	public Map<String,Object> parseLine(String applianceLine){
		return new HashMap<String,Object>();
	}
}