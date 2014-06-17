package com.epam.task1.entity;


import java.util.ArrayList;

public class StationaryComputer {
    private int price;
    private ArrayList<ComputerPart> parts = new ArrayList<ComputerPart>();

    public void add(ComputerPart computerPart) {
        price += ComputerPart.getPrice();
        parts.add(computerPart);
    }

    @Override
    public String toString() {
        return "StationaryComputer{" +
                "price=" + price +
                ", parts=" + parts +
                '}';
    }

    }