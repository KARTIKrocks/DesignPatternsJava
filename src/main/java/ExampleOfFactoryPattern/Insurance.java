package ExampleOfFactoryPattern;

public interface Insurance {
    VehicleInsuranceInterface getVehicleInsurance(InsTerm term);
    HealthInsuranceInterface getHealthInsurance(InsTerm term);
}

class HealthInsurance implements Insurance{

    @Override
    public VehicleInsuranceInterface getVehicleInsurance(InsTerm term) {
        return null;
    }
    @Override
    public HealthInsuranceInterface getHealthInsurance(InsTerm term) {
        switch (term){
            case LONG_TERM: return new LongTermHealthInsurance();
            case SHORT_TERM: return new ShortTermHealthInsurance();
        }
        return null;
    }
}
class VehicleInsurance implements Insurance{

    @Override
    public VehicleInsuranceInterface getVehicleInsurance(InsTerm term) {
        switch (term){
            case LONG_TERM: return new LongTermVehicleInsurance();
            case SHORT_TERM: return new ShortTermVehicleInsurance();
        }
        return null;
    }

    @Override
    public HealthInsuranceInterface getHealthInsurance(InsTerm term) {
        return null;
    }
}