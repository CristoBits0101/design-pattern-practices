package com.patterns.structural.decorator;

import com.patterns.structural.decorator.services.implementations.PhoneServiceImpl;
import com.patterns.structural.decorator.services.implementations.decorated.IPhoneServiceImpl;
import com.patterns.structural.decorator.services.implementations.decorated.SmartphoneServiceImpl;

public class Main {

    public static void main(String[] args) {

        // 5.1: Create a basic phone and show functionality
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        phoneService.showFunctionality();

        // 5.2: Create a Smartphone and show functionality
        SmartphoneServiceImpl smartphoneService = new SmartphoneServiceImpl(phoneService);
        smartphoneService.showFunctionality();

        // 5.3: Create an iPhone and show functionality
        IPhoneServiceImpl iPhoneService = new IPhoneServiceImpl(
                new SmartphoneServiceImpl(
                        new PhoneServiceImpl()));
        iPhoneService.showFunctionality();

    }

}
