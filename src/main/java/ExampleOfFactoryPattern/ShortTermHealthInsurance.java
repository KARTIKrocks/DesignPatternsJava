package ExampleOfFactoryPattern;

public class ShortTermHealthInsurance implements HealthInsuranceInterface{

    @Override
    public void getInsurance() {
        System.out.println("short term health insurance .");
    }
}
