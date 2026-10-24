package com.patterns.behavior.observer;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ObserverTest {
    @Test
    void onlyCurrentSubscribersReceiveNewPublications() {
        NewsAgency agency = new NewsAgency();
        Reader ana = new Reader();
        Reader luis = new Reader();
        agency.subscribe(ana);
        agency.subscribe(luis);
        agency.publish("Primera");

        agency.unsubscribe(luis);
        agency.publish("Segunda");

        assertEquals(List.of("Primera", "Segunda"), ana.getNews());
        assertEquals(List.of("Primera"), luis.getNews());
    }
}
