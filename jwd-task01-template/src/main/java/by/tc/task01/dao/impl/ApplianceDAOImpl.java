package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.io.*;

public class ApplianceDAOImpl implements ApplianceDAO{

	public <E> Appliance find(Criteria<E> criteria) throws IOException{
		String path = "src\\main\\resources\\appliances_db.txt";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(path)));

		String generic = criteria.getGeneric();
		String applianceLine;
		while ((applianceLine = bufferedReader.readLine())!=null){
			if (generic.equals(applianceLine.split(" ")[0])){
				if (criteria.isContained(applianceLine)){
					return Appliance.getAppliance(generic);
				}
			}
		}
		return null;
	}
}