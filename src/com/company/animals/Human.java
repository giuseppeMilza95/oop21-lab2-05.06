package com.company.animals;

import com.company.animals.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;
import com.company.devices.Sellable;

public class Human extends Animal implements Sellable {
    public String firstName;
    public String lastName;
    public Animal pet;
    public Phone phone;
    public Car car;
    public double cash;


    public final static String HUMAN_SPECIE = "homo sapiens";

    private Double salary;

    public Human(Double salary) {
        super(HUMAN_SPECIE);
        this.setSalary(salary);
    }

    public Double getSalary() {
        //check the access rights of the user
        //log some information
        //check if we have a value in cache
        //if not read it from database
        return this.salary;
    }

    public void setSalary(Double newSalary) {
        if (newSalary > 0) {
            this.salary = newSalary;
        } else {
            System.out.println("NOBODY WILL PAY FOR WORKING");
            this.salary = 0.0;
        }
    }


    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        System.out.println("Human cannot be sold");
        return false;
    }
}
