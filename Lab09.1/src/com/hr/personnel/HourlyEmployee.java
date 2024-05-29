package com.hr.personnel;

import gov.irs.TaxPayer;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);  // delegate to superclass ctor, which handles name, hireDate
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);   // delegate to neighboring ctor, which handles name, hireDate
        setRate(rate);          // handle these myself, by delegating to their setters
        setHours(hours);
    }

    // business or "action" methods
    @Override
    public void pay() {
        System.out.println(getName() + " is paid hourly " + (getRate() * getHours()));
    }

    @Override  // interface TaxPayer
    public void payTaxes() {
        double taxes = getRate() * getHours() * HOURLY_TAX_RATE;
        System.out.printf("%s paid hourly taxes of %s\n", getName(), taxes);
    }

    // accessor methods
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        // delegate to superclass toString() (Employee) for classname, name, and hireDate info
        // and then add on my bit: rate and hours
        return super.toString() + ", rate=" + getRate() + ", hours=" + getHours();
    }
}