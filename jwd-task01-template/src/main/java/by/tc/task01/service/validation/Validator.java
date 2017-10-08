package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.Criteria;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

public class Validator {
	
	public static <E> boolean criteriaValidator(Criteria<E> criteria) throws NumberFormatException {
		List<String>intCriteria = new ArrayList<String>(asList("MEMORY_ROM", "SYSTEM_MEMORY","DISPLAY_INCHS","POWER_CONSUMPTION",
				"CAPACITY","DEPTH","FREEZER_CAPACITY","NUMBERS_OF_SPEAKERS", "CORD_LENGTH","FLASH_MEMORY_CAPACITY"));
		List<String>doubleCriteria = new ArrayList<String>(asList("BATTERY_CAPACITY",
				"CPU","WEIGHT","HEIGHT","WIDTH","MOTOR_SPEED_REGULATION","CLEANING_WIDTH"));
		List<String>stringCriteria = new ArrayList<String>(asList("FREQUENCY_RANGE", "COLOR","FILTER_TYPE","BAG_TYPE","WAND_TYPE"));

		for (Map.Entry<E,Object> pair : criteria.getHashMap().entrySet()){
			String stringKey = pair.getKey().toString();
			if (intCriteria.contains(stringKey)){
				int intValue = Integer.parseInt(pair.getValue().toString());
				if (intValue<0) {
					return false;
				}
			}
			if(doubleCriteria.contains(stringKey)){
				double doubleValue = Double.parseDouble(pair.getValue().toString());
				if (doubleValue<0){
					return false;
				}
			}
			if(stringCriteria.contains(stringKey)){
				String stringValue = pair.getValue().toString();
				if (stringValue.length()>20) {
					return false;
				}
			}
		}
		return true;
	}

}