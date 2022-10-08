package FactoryPettern.Factory;

import FactoryPettern.Phone.OS;

public class FactoryMain {
    public static void main(String[] args) {
        OperatingSystemFactory a=new OperatingSystemFactory();
        OS obj = a.getInstance("asd");
        obj.spec();
    }
}
