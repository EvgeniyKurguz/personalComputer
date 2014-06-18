package com.epam.task1.entity;


 public abstract class ComputerPart implements Cloneable {
      private String name;
      private int price;

     public ComputerPart() {

     }

     public void setName(String name) {
         this.name = name;

     }

     @Override
     public String toString() {
         return "ComputerPart{" +
                 "name='" + name + '\'' +
                 ", price=" + price +
                 '}';
     }

     public ComputerPart(String name, int price) {
         this.name = name;
         this.price = price;
     }
     public String getName() {
         return name;
     }

     public abstract String name();

     public static int getPrice() {
         return 0;
     }

     public void setPrice(int price) {
         this.price = price;
     }
     public ComputerPart createCopy()  {
         try {
             return (ComputerPart) super.clone();
         } catch (CloneNotSupportedException e) {
             e.printStackTrace();
         }
         return null;
     }
 }

