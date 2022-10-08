package AbstractFactoryPattern;

import AbstractFactoryPattern.Enumerators.DeviceType;
import AbstractFactoryPattern.Enumerators.FactoryType;

public class Client {
    public static void main(String[] args) {
        Device dell=FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());
        AbstractDeviceFactory mobileFactory = FactoryGenerator.getFactory(FactoryType.MOBILEFACOTRY);
        Device nokia=mobileFactory.getGadget(DeviceType.NOKIA);
        System.out.println(nokia.getDetails());
        System.out.println(nokia.toString());
    }
}
