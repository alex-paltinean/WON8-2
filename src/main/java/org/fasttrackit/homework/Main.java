package org.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Quote> quotes = new ArrayList<>();
        quotes.add(new Quote(1, "Frank Zappa", "So many books, so little time."));
        quotes.add(new Quote(3, "Gandhi", "Be the change that you wish to see in the world."));
        quotes.add(new Quote(5, "Gandhi", "Live as if you were to die tomorrow. Learn as if you were to live forever."));
        QuoteService service = new QuoteService(quotes);
        System.out.println(service.getAuthors());
        service.setFavourite(5);

        System.out.println(service.getRandomQuote());
    }
}
