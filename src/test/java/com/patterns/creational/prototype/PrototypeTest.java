package com.patterns.creational.prototype;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrototypeTest {
    @Test
    void theCopyPreservesStateAndCanBeRenamedIndependently() {
        Document original = new Document("Plantilla", "Contenido");
        Document copy = original.copy();

        assertNotSame(original, copy);
        assertEquals(original.getTitle(), copy.getTitle());
        assertEquals(original.getBody(), copy.getBody());

        copy.rename("Informe");
        assertEquals("Plantilla", original.getTitle());
        assertEquals("Informe", copy.getTitle());
    }
}
