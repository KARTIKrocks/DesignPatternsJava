package AbstractFactoryPattern;

import AbstractFactoryPattern.Enumerators.FactoryType;

public class FactoryGenerator {
    public static AbstractDeviceFactory getFactory(FactoryType factoryType){
        switch (factoryType){
            case LAPTOPFACTORY:return new LaptopFactory();
            case MOBILEFACOTRY:return new MobileFactory();
        }
        return null;
    }
}
