package ExampleOfFactoryPattern;

public class ShortTermVehicleInsurance implements VehicleInsuranceInterface{

    @Override
    public void getInsurance() {
        System.out.println("short term insurance for Vehicle ..");
    }
}
