package com.hr.personnel;

import java.time.LocalDate;

public class Executive extends SalariedEmployee {

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " enjoying a nice round of golf");
    }

    // OPT-IN to override fileReturn() to do it differently
    @Override  // interface TaxPayer
    public void fileReturn() {
        System.out.println("Return filed electronically");
    }
}