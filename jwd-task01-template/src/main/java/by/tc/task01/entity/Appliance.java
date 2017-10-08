package by.tc.task01.entity;

public class Appliance {
    Appliance(){}
    public static Appliance getAppliance(String generic){
        if (generic.equals("Laptop")){
            return new Laptop();
        }
        if(generic.equals("Oven")) {
            return new Oven();
        }
        if(generic.equals("Refrigerator")) {
            return new Refrigerator();
        }
        if(generic.equals("Speakers")) {
            return new Speakers();
        }
        if(generic.equals("TabletPC")) {
            return new TabletPC();
        }
        if(generic.equals("VacuumCleaner")) {
            return new VacuumCleaner();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Appliance";
    }
}
