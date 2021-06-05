package com.company.devices;

import com.company.animals.Human;

public class Phone extends Device {
    public final Double screenSize;
    public String os;

    public static String greetings = "HELLO";

    public Phone(String producer, String model, Double screenSize, String os) {
        this.screenSize = screenSize;
        this.os = os;
        this.producer = producer;
        this.model = model;
    }

    /*public String toString() {
        return "producer: " + this.producer
                + " model: " + this.model;
    }
*/
    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", screenSize=" + screenSize +
                ", os='" + os + '\'' +
                '}';
    }

    @Override
    public void turnOn() {
        System.out.println("Phone is turned on");
    }

    @Override
    public boolean sell(Human seller, Human buyer, Double price) {
        if (seller.phone == this){
            if (buyer.cash >= price){
                buyer.cash -= price;
                buyer.phone = this;
                seller.car = null;
                System.out.println("Phone has been sold");
                return true;


            }


        }
        System.out.println("The buyer does not have enough money");
        return false;
    }
}
