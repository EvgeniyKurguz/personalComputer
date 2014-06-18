package com.epam.task1.entity;


import java.util.Comparator;

public class ComputerComparator implements Comparator<ComputerComparator> {
    private String name;
    private int price;

    public ComputerComparator(String name, int price) {
    this.name = name;
        this.price = price;
    }

    public ComputerComparator() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }



    @Override
    public String toString() {
        return "ComputerComparator{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compare(ComputerComparator o1, ComputerComparator o2) {
        return o1.getName().compareTo(o2.getName());

           }


}

