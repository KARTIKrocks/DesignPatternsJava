package AbstractFactoryPattern.Devices;

import AbstractFactoryPattern.Device;

public class Nokia extends Device {
    private String ram;
    private String processor;

    public Nokia(String ram, String processor) {
        this.ram = ram;
        this.processor = processor;
    }

    @Override
    public String getDetails() {
        return "Nokia config: ram size:"+this.ram+" processor type:"+this.processor;
    }

    @Override
    public String toString() {
        return "Nokia{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                '}';
    }
}
