package com.patterns.structural.decorator;

import com.patterns.structural.decorator.services.implementations.IPhoneServiceImpl;
import com.patterns.structural.decorator.services.implementations.PhoneServiceImpl;
import com.patterns.structural.decorator.services.implementations.SmartphoneServiceImpl;

public class Main {

    public static void main(String[] args) {

        // 5.1: Create a PhoneServiceImpl object and call the Create method
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        phoneService.create();

        // 5.2: Create a SmartphoneServiceImpl object and call the Create method
        SmartphoneServiceImpl smartphoneService = new SmartphoneServiceImpl(phoneService);
        smartphoneService.create();

        // 5.3: Create an iPhoneServiceImpl object and call the method in the second way
        IPhoneServiceImpl iPhoneService = new IPhoneServiceImpl(
                new SmartphoneServiceImpl(
                        new PhoneServiceImpl()));
        iPhoneService.create();

    }

}
