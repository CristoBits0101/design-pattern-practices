package com.patterns.behavior.iterator;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

final class BookShelf implements Iterable<String> {
    private final List<String> books;

    public BookShelf(List<String> books) {
        this.books = List.copyOf(books);
    }

    @Override
    public Iterator<String> iterator() {
        return new BookIterator(books);
    }
}

final class BookIterator implements Iterator<String> {
    private final List<String> books;
    private int position;

    BookIterator(List<String> books) {
        this.books = books;
    }

    @Override
    public boolean hasNext() {
        return position < books.size();
    }

    @Override
    public String next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No quedan libros.");
        }
        return books.get(position++);
    }
}

public class Main {

    public static void main(String[] args) {
        BookShelf shelf = new BookShelf(List.of("Java", "SQL"));
        Iterator<String> iterator = shelf.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Nuevo recorrido: " + shelf.iterator().next());
    }
}
