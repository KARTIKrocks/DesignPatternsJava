package FactoryPettern.Factory;

import FactoryPettern.Phone.Android;
import FactoryPettern.Phone.IOS;
import FactoryPettern.Phone.OS;
import FactoryPettern.Phone.Windows;

public class OperatingSystemFactory {
    protected OS getInstance(String str){
        if (str.equals("Android")){
            return new Android();
        } else if (str.equals("ios")) {
            return new IOS();
        }else return new Windows();
    }

}
