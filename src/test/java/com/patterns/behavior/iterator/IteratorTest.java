package com.patterns.behavior.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IteratorTest {
    @Test
    void traversalsAreIndependentAndExhaustionIsExplicit() {
        BookShelf shelf = new BookShelf(List.of("Java", "SQL"));
        Iterator<String> first = shelf.iterator();
        Iterator<String> second = shelf.iterator();

        assertEquals("Java", first.next());
        assertEquals("SQL", first.next());
        assertFalse(first.hasNext());
        assertThrows(NoSuchElementException.class, first::next);
        assertEquals("Java", second.next());
        assertTrue(second.hasNext());
    }
}
