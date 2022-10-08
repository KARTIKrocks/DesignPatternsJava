package AnotherAbstractFactoryPattern;


// step2:=Create concrete classes implementing the same interface.

public class RoundedSquare implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw method.");
    }
}
