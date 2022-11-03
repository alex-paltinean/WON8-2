package homework;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PersonService {
    @Getter
    private final List<Person> persons = new ArrayList<>();

    public Person addPerson(Person person) {
        Person personWithId = new Person(getNewId(), person.getName(), person.getAge());
        getPersons().add(personWithId);
        return personWithId;
    }

    int getNewId() {
        Random random = new Random();
        while (true) {
            int randomId = random.nextInt(1000);
            if (!alreadyExists(randomId)) {
                return randomId;
            }
        }
    }

    Boolean alreadyExists(int personId) {
        for (Person person : getPersons()) {
            if (person.getId() == personId) {
                return true;
            }
        }
        return false;
    }
}
