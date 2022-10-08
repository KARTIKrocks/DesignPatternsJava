package ExampleOfFactoryPattern;

public class LongTermVehicleInsurance implements VehicleInsuranceInterface{
    @Override
    public void getInsurance() {
        System.out.println("long term insurance for vehicle ..");
    }
}
