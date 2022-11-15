package com.fasttrackit.streams;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class StreamExercises {
    public static void main(String[] args) {
        List<Citizen> citizens = List.of(
                new Citizen("Mike", 28, "student", false),
                new Citizen("Amanda", 35, "artist", true),
                new Citizen("Nick", 24, "designer", true),
                new Citizen("Pete", 45, "artist", false)
        );

        // test flow

        citizens.stream()
                .map(citizen -> {
                    System.out.println("mapped " + citizen);
                    return citizen.name();
                })
                .sorted()
                .map(name -> {
                    System.out.println("mapped " + name);
                    return name.length();
                })
                .toList();

        Stream<Citizen> stream = citizens.stream();

        List<Citizen> marriedOver30 = citizens.stream()
                .filter(citizen -> citizen.age() > 30)
                .filter(citizen -> citizen.married())
                .toList();
        System.out.println(marriedOver30);

        List<Integer> nameLength = citizens.stream()
                .map(Citizen::name)
                .map(String::length)
                .toList();
        System.out.println(nameLength);

        long count = citizens.stream()
                .filter(Citizen::married)
                .count();
        System.out.println("Married citizens: " + count);

        boolean areAllArtistsMarried = citizens.stream()
                .filter(citizen -> citizen.profession().equals("artist"))
                .allMatch(Citizen::married);
        System.out.println(areAllArtistsMarried);

        boolean isAnyArtistMarried = citizens.stream()
                .filter(citizen -> citizen.profession().equals("artist"))
                .anyMatch(Citizen::married);
        System.out.println(isAnyArtistMarried);

        List<String> naturallySorted = citizens.stream()
                .map(Citizen::name)
                .sorted()
                .toList();
        System.out.println(naturallySorted);

        List<Citizen> sortedCitizens = citizens.stream()
                .sorted(Comparator.comparing(Citizen::married, Boolean::compare).reversed().thenComparing(Citizen::age))
                .toList();
        System.out.println(sortedCitizens);

        OptionalDouble averageAge = citizens.stream()
                .mapToInt(Citizen::age)
                .average();
        System.out.println(averageAge.getAsDouble());
    }
}

record Citizen(String name, int age, String profession, boolean married) {


}
