package com.vpetelsky;

import java.util.*;

public class PersonGenerator {

    private static final String[] NAMES = {
            // MALE
            "John", "Alex", "Ben", "Thomas", "William",
            // FEMALE
            "Emilу", "Elizabeth", "Ashley", "Rachel", "Olivia"
    };

    private static final String[] SURNAMES = {
            "Randall", "Stevenson", "Hill", "Edwards", "Coleman", "King", "Lee", "James", "Smith", "Taylor"
    };

    private List<Person> personList = new ArrayList<>();

    public PersonGenerator(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            Person person = new Person(
                    NAMES[random.nextInt(NAMES.length)],
                    SURNAMES[random.nextInt(SURNAMES.length)]
            );
            personList.add(person);
        }
    }

    public void removeDuplicates() {
        Set<Person> set = new HashSet<>(personList);
        personList = new ArrayList<>(set);
    }

    public void print() {
        int count = 1;
        for (Person p : personList) {
            System.out.printf("%03d) %-24s - %2d years old [%3dkg, %3dcm]\n",
                    count,
                    p.getFirstName() + " " + p.getLastName(),
                    p.getAge(),
                    p.getWeight(),
                    p.getHeight()
            );
            count++;
        }
    }
}