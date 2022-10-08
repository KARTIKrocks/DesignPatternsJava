package AbstractFactoryPattern;

import AbstractFactoryPattern.Devices.Dell;
import AbstractFactoryPattern.Devices.HP;
import AbstractFactoryPattern.Enumerators.DeviceType;

public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case HP:return new HP("8gb","Intel","Nvidia");
            case DELL:return new Dell("12gb","AMD","Nvidia");
        }
        return null;
    }
}
