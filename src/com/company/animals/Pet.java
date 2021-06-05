package com.company.animals;

import com.company.animals.Animal;
import com.company.devices.Sellable;

public class Pet extends Animal implements Sellable {
    Human human;
    public Pet(String species) {
        super(species);
    }
    @Override
    public boolean sell(Human seller, Human buyer, Double price) {

            System.out.println("The Human cannot be sold");


            if (seller.pet == this) {
                if (buyer.cash >= price) {
                    buyer.cash -= price;
                    buyer.pet = this;
                    seller.car = null;
                    System.out.println("Pet has been sold");
                    return true;


                }

            }
            System.out.println("cannot be sold");

        return false;
    }

}
