package net.people;

import java.time.LocalDate;

class PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person("Jay", LocalDate.of(1966, 12, 5));

        // print: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.name(), p1.age());

        System.out.println(p1);  // toString() automatically called

        System.out.println();

        PersonRecord p2 = new PersonRecord("Martina", LocalDate.of(1973, 6, 19));

        System.out.printf("%s is %s years old\n", p2.name(), p2.age());

        System.out.println(p2);  // toString() automatically called
    }
}