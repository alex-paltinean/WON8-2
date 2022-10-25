package org.fasttrackit.homework;

import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public class QuoteService {
    private final List<Quote> quotes;

    // getAuthors(): List<String> (distinct)
    public List<String> getAuthors() {
        Set<String> result = new HashSet<>();
        for (Quote quote : quotes) {
            result.add(quote.getAuthor());
        }
        return new ArrayList<>(result);
    }

    // setFavourite(int id)
    public void setFavourite(int id) {
        for (Quote quote : quotes) {
            if (quote.getId() == id) {
                quote.setFavorite(true);
                return;
            }
        }
    }

    // getRandomQuote():String : generati un numar random cu ajutorul obiectului java.util.Random si returnati quote-ul cu acel id
    public String getRandomQuote() {
        Random random = new Random();
        int randomIndex = random.nextInt(quotes.size());
        return quotes.get(randomIndex).getQuote();
    }

}
