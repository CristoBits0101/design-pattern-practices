package com.patterns.structural.decorator;

import com.patterns.structural.decorator.services.IPhoneServiceImpl;
import com.patterns.structural.decorator.services.PhoneServiceImpl;
import com.patterns.structural.decorator.services.SmartphoneServiceImpl;

public class Main {

    public static void main(String[] args) {

        // 3.1: Create a PhoneServiceImpl object and call the Create method
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        phoneService.create();

        // 3.2: Create a SmartphoneServiceImpl object and call the Create method
        SmartphoneServiceImpl smartphoneService = new SmartphoneServiceImpl(phoneService);
        smartphoneService.create();

        // 3.3: Create an iPhoneServiceImpl object and call the method in the second way
        IPhoneServiceImpl iPhoneService = new IPhoneServiceImpl(new SmartphoneServiceImpl(new PhoneServiceImpl()));
        iPhoneService.create();

    }

}
