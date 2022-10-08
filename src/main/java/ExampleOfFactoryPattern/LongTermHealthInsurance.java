package ExampleOfFactoryPattern;

public class LongTermHealthInsurance implements HealthInsuranceInterface{
    @Override
    public void getInsurance() {
        System.out.println("long term health insurance  ..");
    }
}
