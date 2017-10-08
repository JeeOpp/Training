package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {
	public static void main(String[] args) {
		try {
			Appliance appliance;

			ServiceFactory factory = ServiceFactory.getInstance();
			ApplianceService service = factory.getApplianceService();

			//////////////////////////////////////////////////////////////////
			Criteria<Oven> criteriaOven = new Criteria<Oven>();
			criteriaOven.add(Oven.CAPACITY, 33);
			criteriaOven.add(Oven.POWER_CONSUMPTION, 2000);
			criteriaOven.add(Oven.WIDTH, 70);
			appliance = service.find(criteriaOven);

			PrintApplianceInfo.print(appliance);

			//////////////////////////////////////////////////////////////////

			criteriaOven = new Criteria<Oven>();
			criteriaOven.add(Oven.HEIGHT, 4);
			criteriaOven.add(Oven.DEPTH, 60);

			appliance = service.find(criteriaOven);

			PrintApplianceInfo.print(appliance);
			//////////////////////////////////////////////////////////////////

			Criteria<TabletPC> criteriaTabletPC = new Criteria<TabletPC>();
			criteriaTabletPC.add(TabletPC.COLOR, "blue");
			criteriaTabletPC.add(TabletPC.DISPLAY_INCHES, 14);
			criteriaTabletPC.add(TabletPC.MEMORY_ROM, 8000);

			appliance = service.find(criteriaTabletPC);

			PrintApplianceInfo.print(appliance);
		} catch (java.io.IOException ex) {
			ex.printStackTrace();
		} catch (NumberFormatException ex) {
			 ex.printStackTrace();
		} catch (IllegalArgumentException ex){
			System.out.println(ex.getMessage());
		}
	}

}
