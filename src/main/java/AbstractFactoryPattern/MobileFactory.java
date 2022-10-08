package AbstractFactoryPattern;

import AbstractFactoryPattern.Devices.Nokia;
import AbstractFactoryPattern.Devices.OnePlus;
import AbstractFactoryPattern.Enumerators.DeviceType;

public class MobileFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
        switch (deviceType){
            case ONEPLUS:return new OnePlus("8gb","qualcomn");
            case NOKIA:return new Nokia("12gb","intel");
        }
        return null;
    }
}
