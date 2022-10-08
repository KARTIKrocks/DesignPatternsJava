package AbstractFactoryPattern.Devices;

import AbstractFactoryPattern.Device;

public class Dell extends Device {
    private String ram;
    private String processor;

    private String gpu;

    public Dell(String ram, String processor, String gpu) {
        this.ram = ram;
        this.processor = processor;
        this.gpu = gpu;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }

    @Override
    public String getDetails() {
        return "Dell config: ram size:"+this.ram+" processor type:"+this.processor+" gpu:"+this.gpu;
    }

}
