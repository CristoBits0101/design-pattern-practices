package com.patterns.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Document original = new Document("Plantilla", "Contenido inicial");
        Document copy = original.copy();
        copy.rename("Informe");
        System.out.println("Original: " + original.getTitle() + " / " + original.getBody());
        System.out.println("Copia: " + copy.getTitle() + " / " + copy.getBody());
    }
}

final class Document {
    private String title;
    private final String body;

    public Document(String title, String body) {
        this.title = title;
        this.body = body;
    }

    public Document copy() {

        return new Document(title, body);
    }

    public void rename(String title) {
        this.title = title;
    }

    public String getTitle() { return title; }
    public String getBody() { return body; }
}
