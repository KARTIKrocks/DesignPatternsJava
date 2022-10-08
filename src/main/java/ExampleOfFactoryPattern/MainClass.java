package ExampleOfFactoryPattern;

public class MainClass {
    public static void main(String[] args) {
        Insurance obj= InsFactory.getInsuranceByType(InsType.VEHICLE);
        VehicleInsuranceInterface ob = obj.getVehicleInsurance(InsTerm.LONG_TERM);
        ob.getInsurance();
    }
}
