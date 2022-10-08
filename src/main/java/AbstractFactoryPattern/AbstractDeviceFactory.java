package AbstractFactoryPattern;

import AbstractFactoryPattern.Enumerators.DeviceType;

public abstract class AbstractDeviceFactory {
    abstract Device getGadget(DeviceType deviceType);
}
