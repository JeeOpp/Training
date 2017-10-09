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

	public boolean subLine(String applianceLine){
		Pattern pattern;
		Matcher matcher;
		for (Map.Entry<E,Object> pair : criteria.entrySet()){
			pattern = Pattern.compile(".*"+pair.getKey().toString()+"="+pair.getValue().toString()+"[,|;]"+".*");
			matcher = pattern.matcher(applianceLine);
			if(!matcher.matches()) {
				return false;
			}
		}
		return true;
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
