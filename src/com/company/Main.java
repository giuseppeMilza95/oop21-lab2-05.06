package com.company;

import com.company.animals.Animal;
import com.company.animals.FarmAnimal;
import com.company.animals.Human;
import com.company.devices.Car;
import com.company.devices.Diesel;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

   /*     Animal dog = new Animal("dog");

        dog.name = "Szarik";

        Human me = new Human(1000.0);
        me.firstName = "Kacper";
        me.lastName = "Warda";
        me.pet = dog;

        Phone onePlus = new Phone("onePlus",
                "8Pro",
                2.3,
                "Android");

        Phone iPhone6 = new Phone("apple", "6s", 5.0, "iOs");

        System.out.println("phone: " + onePlus);
        System.out.println("phone: " + iPhone6);
        System.out.println("human: " + me);


        onePlus.turnOn();

        Car fiat = new Diesel();
        fiat.refuel();

        fiat.engineSize = 1.9;
        fiat.fuelType = "diesel";
        fiat.producer = "Fiat";
        fiat.model = "Bravo";

        System.out.println(iPhone6.os);
        System.out.println(iPhone6.screenSize);
        System.out.println(iPhone6.model);
        System.out.println(iPhone6.producer);

        fiat.turnOn();
        iPhone6.turnOn();

        System.out.println(me instanceof Human);
        System.out.println(me instanceof Animal);

        System.out.println(me.getClass());
        System.out.println(me.getClass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass());
        System.out.println(me.getClass().getSuperclass().getSuperclass().getSuperclass());*/


        // My code



        // sell car example
        Human me = new Human(1000.0);
        Car fiat = new Diesel();
        Human giuseppe = new Human(3000.0); // buyer of the car
        giuseppe.cash = 10000; // set the amount of money available in giuseppe's wallet
        me.car = fiat; // the seller owns the car
        fiat.sell(me, giuseppe, 11000.0); // calling the method and pass the seller, buyer and set the price


        // sell phone example
        Phone iphoneX = new Phone("Apple", "X", 8.0,"ios" );
        Human sellerPhone = new Human(5000.0);
        Human buyerPhone = new Human(5000.0);
        sellerPhone.phone = iphoneX;
        buyerPhone.cash = 10000;

        iphoneX.sell(sellerPhone,buyerPhone, 5000.0);

        // FarmAnimal

        FarmAnimal pig = new FarmAnimal("pig");
        pig.setWeight(5.0);
        System.out.println("The animal's weight is: " + pig.eat() + " Kg");







    }
}
