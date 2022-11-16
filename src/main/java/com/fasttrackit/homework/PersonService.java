package com.fasttrackit.homework;

import java.util.Comparator;
import java.util.List;

@Service
public class PersonService {
    private final List<Person> persons;
    private final PersonDataAccessObject personDataAccessObject;

    public PersonService(PersonDataAccessObject personDataAccessObject) {
        this.personDataAccessObject = personDataAccessObject;
    }

    public PersonService(List<Person> persons) {
        this.persons = persons;
    }

    //list all the persons names: firstName lastName
    public List<String> getFullNames() {
        return persons.stream()
                .map(person -> "%s %s".formatted(person.firstName(), person.lastName()))
                .toList();
    }

    //list all persons with 18 < age < 60
    public List<Person> getPersonsWithAgeBetween(int minAge, int maxAge) {
        return persons.stream()
                .filter(person -> isValid(minAge, maxAge, person))
                .toList();
    }

    private boolean isValid(int minAge, int maxAge, Person person) {
        return person.age() > minAge && person.age() < maxAge;
    }

    // sort the persons by first name
    public List<Person> getSortedByFirstName() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::firstName))
                .toList();
    }

    // sort the persons by first name, last name and then age
    public List<Person> getSorted() {
        return persons.stream()
                .sorted(Comparator.comparing(Person::firstName).thenComparing(Person::lastName).thenComparing(Person::age))
                .toList();
    }
}
