package com.patterns.creational.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {
    @Test
    void concurrentCallersReceiveTheSameInstance() throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(8);
        CountDownLatch start = new CountDownLatch(1);

        try {
            List<Future<Settings>> references = new ArrayList<>();
            for (int i = 0; i < 8; i++) {
                references.add(executor.submit(() -> {
                    start.await();
                    return Settings.getInstance();
                }));
            }
            start.countDown();

            Settings first = references.get(0).get(5, TimeUnit.SECONDS);
            for (Future<Settings> reference : references) {
                assertSame(first, reference.get(5, TimeUnit.SECONDS));
            }
        } finally {
            start.countDown();
            executor.shutdownNow();
            assertTrue(executor.awaitTermination(5, TimeUnit.SECONDS));
        }
    }
}
