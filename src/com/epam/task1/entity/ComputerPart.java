package com.epam.task1.entity;


 public abstract class ComputerPart {
      private String name;
     //public String componentParts;
     //private String peripherals;
     private int price;

     public ComputerPart(String name, int price) {

     }

     protected ComputerPart() {
     }

     public abstract String name();

     public  static int getPrice(){
         return 0;
     }


      }

