package AbstractFactoryPattern.Devices;

import AbstractFactoryPattern.Device;

public class OnePlus extends Device {
    private String ram;
    private String processor;

    public OnePlus(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return "OnePlus config: ram size:"+this.ram+" processor type:"+this.processor;
    }

    @Override
    public String toString() {
        return "OnePlus{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
