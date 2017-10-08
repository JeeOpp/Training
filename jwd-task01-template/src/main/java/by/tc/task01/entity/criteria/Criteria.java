package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Criteria<E> {
	private Map<E, Object> criteria = new HashMap<E, Object>();

	public Criteria(){}

	public void add(E searchCriteria, Object value) {
		criteria.put(searchCriteria, value);
	}

	public Map<E, Object> getHashMap(){
		return criteria;
	}

	public String getGeneric(){
		return criteria.entrySet().iterator().next().getKey().getClass().getSimpleName();
	}

	public boolean isContained(String applianceLine){
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
}
