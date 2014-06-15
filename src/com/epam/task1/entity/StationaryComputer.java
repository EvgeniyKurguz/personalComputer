package com.epam.task1.entity;


import java.util.ArrayList;

public class StationaryComputer {
    private  int price = 0;
    private ArrayList<String> compozition = new ArrayList<String>();

   public void addComputerPart(ComputerPart computerPart) {
       price += ComputerPart.getPrice();
        compozition.add(computerPart.getComponentParts());
    }

    public int getPrice() {
        return price;
    }

    public void printCompozition() {
        for (String n : compozition) {
            System.out.println(" " + n);
        }
    }


}