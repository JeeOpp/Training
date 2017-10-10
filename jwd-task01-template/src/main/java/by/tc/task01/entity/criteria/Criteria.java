package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Criteria<E> {
	private String applianceType;

	private Map<E, Object> criteria = new HashMap<E, Object>();

	public Criteria(){}

	public String getApplianceType(){
		return applianceType;
	}

	public void setApplianceType(String applianceType){
		this.applianceType=applianceType;
	}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getHashMap(){
		return criteria;
	}

	public boolean subMap(Map<String, Object> parsedLine){
		for(Map.Entry<E,Object> pair : criteria.entrySet()){
			String first = parsedLine.get(pair.getKey().toString()).toString();
			String second = pair.getValue().toString();
			if (!(first.equals(second))){
				return false;
			}
		}
		return true;
	}
}
