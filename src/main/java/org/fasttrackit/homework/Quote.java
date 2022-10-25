package org.fasttrackit.homework;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Getter
public class Quote {
    private final int id;
    private final String author;
    private final String quote;
    @Setter
    private boolean favorite;
}
