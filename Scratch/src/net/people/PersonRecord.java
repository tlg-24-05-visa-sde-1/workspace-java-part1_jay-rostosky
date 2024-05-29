package net.people;

import java.time.LocalDate;
import java.time.Period;

record PersonRecord(String name, LocalDate birthDate) {
    // for free, you get the following in the PersonRecord.class file:
    // 2 private fields
    // 2-arg ctor
    // getters for each, with the "get" prefix omitted, e.g., name() instead of getName()
    // toString()
    // equals() and hashCode() - more on these later

    public int age() {
        return Period.between(birthDate(), LocalDate.now()).getYears();
    }
}
