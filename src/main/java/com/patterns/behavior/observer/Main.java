package com.patterns.behavior.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * Problema: avisar a los lectores interesados cuando se publica una noticia.
 * Idea: la agencia mantiene suscriptores con un contrato común.
 * Observa: un lector que se da de baja deja de recibir novedades.
 */
interface Subscriber {
    void update(String news);
}

final class NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        if (!subscribers.contains(subscriber)) {
            subscribers.add(subscriber);
        }
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publish(String news) {
        for (Subscriber subscriber : List.copyOf(subscribers)) {
            subscriber.update(news);
        }
    }
}

final class Reader implements Subscriber {
    private final List<String> news = new ArrayList<>();

    @Override
    public void update(String message) {
        news.add(message);
    }

    public List<String> getNews() {
        return List.copyOf(news);
    }
}

public class Main {

    public static void main(String[] args) {
        NewsAgency agency = new NewsAgency();
        Reader ana = new Reader();
        Reader luis = new Reader();
        agency.subscribe(ana);
        agency.subscribe(luis);
        agency.publish("Primera noticia");

        agency.unsubscribe(luis);
        agency.publish("Actualización");
        System.out.println("Ana: " + ana.getNews());
        System.out.println("Luis: " + luis.getNews());
    }
}
