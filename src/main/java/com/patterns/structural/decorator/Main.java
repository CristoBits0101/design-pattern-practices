package com.patterns.structural.decorator;

import com.patterns.structural.decorator.services.PhoneServiceImpl;

public class Main {

    public static void main(String[] args) {

        // 3.1: Create a PhoneServiceImpl object and call the Create method
        PhoneServiceImpl phoneService = new PhoneServiceImpl();
        phoneService.Create();

    }

}
