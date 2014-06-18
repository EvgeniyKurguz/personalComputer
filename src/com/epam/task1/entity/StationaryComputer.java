package com.epam.task1.entity;


import java.util.ArrayList;
import java.util.Comparator;

public class StationaryComputer  {
    private  int price;
     private String name;
    private ArrayList<ComputerPart> parts = new ArrayList<ComputerPart>();

    public void add(StationaryComputer stationaryComputer) {
        price += ComputerPart.getPrice();
//        add(stationaryComputer);
    }

    @Override
    public String toString() {
        return "StationaryComputer{" +
                "price=" + price +
                ", parts=" + parts +
                '}';
    }

    public static int getPrice() {
        return Integer.parseInt(null);
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

       public String name() {
        return null;
    }



}