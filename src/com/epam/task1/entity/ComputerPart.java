package com.epam.task1.entity;


 public abstract class ComputerPart {

     public String componentParts;
     private String peripherals;
     private int price;

     public ComputerPart(String componentParts) {

     }
     public abstract String componentParts();

     public static int getPrice() {
         return 0;
     }


     public static String getComponentParts() {
         return null;
     }

      }

