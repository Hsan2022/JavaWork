package org.example.CoffeeShop;
//used to describe products

public class Product {
    //members var of class


    //aka beans, data transports
    private double price;
    private String name;
    private boolean beverage;

    //no return type same name
    public Product() {

    }


    //public with custom constructor properties
    public Product (double price, String name, boolean beverage) {
        this.price = price;
        this.name = name;
        this.beverage = beverage;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isBeverage() {
        return beverage;
    }

    public void setBeverage(boolean beverage) {
        this.beverage = beverage;
    }
}
