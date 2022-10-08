package ExampleOfFactoryPattern;

public class InsFactory{
    public static Insurance getInsuranceByType(InsType type){
        switch (type){
            case HEALTH:
                return new HealthInsurance();
            case VEHICLE:
                return  new VehicleInsurance();
        }
        return null;
    }
}
