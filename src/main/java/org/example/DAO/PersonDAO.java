package org.example.DAO;

import org.example.models.Person;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PersonDAO {
    private static int PEOPLE_COUNT=0;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(++PEOPLE_COUNT,"Andrew"));
        people.add(new Person(++PEOPLE_COUNT,"Daniil"));
        people.add(new Person(++PEOPLE_COUNT,"Oleg"));
        people.add(new Person(++PEOPLE_COUNT,"Vladimir"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return people.stream().filter(person -> person.getId() == id).findAny().orElse(null);
    }
}