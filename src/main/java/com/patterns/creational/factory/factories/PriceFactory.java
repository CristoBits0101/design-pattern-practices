package com.patterns.creational.factory.factories;

import com.patterns.creational.factory.services.PriceService;
import com.patterns.creational.factory.services.PriceServiceEURImpl;
import com.patterns.creational.factory.services.PriceServiceUSDImpl;
import java.util.Locale;
import java.util.Objects;

// Simple Factory: el argumento decide qué implementación crear.
public final class PriceFactory {

    private PriceFactory() {
    }

    // Devuelve el objeto creado para que el cliente use su contrato común.
    public static PriceService create(String country) {
        Objects.requireNonNull(country, "Country must not be null");
        return switch (country.toUpperCase(Locale.ROOT)) {
            case "USA" -> new PriceServiceUSDImpl();
            case "EUROPE" -> new PriceServiceEURImpl();
            default -> throw new IllegalArgumentException("Country not supported: " + country);
        };
    }
}
