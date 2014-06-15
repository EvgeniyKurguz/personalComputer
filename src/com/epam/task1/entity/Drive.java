package com.epam.task1.entity;


public class Drive extends ComputerPart {
    private String name;

    private String interfaces; // SATA or IDE
    private String factor; // Internal device or external.

    private int price;

    @Override
    public String toString() {
        return "Дисковод: " +
                "name='" + name + '\'' +
                ", Интерфейс='" + interfaces + '\'' +
                ", Тип='" + factor + '\'' +
                ", Цена=" + price +"Тенге;"
                ;
    }

    public Drive(String componentParts,String name, String
            interfaces, String factor, int price ) {
        super(componentParts);
        this.setName(name);
        this.setInterfaces(interfaces);
        this.setFactor(factor);
        this.setPrice(price);
    }

    String getPeripherals() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(String interfaces) {
        this.interfaces = interfaces;
    }

    public String getFactor() {
        return factor;
    }

    public void setFactor(String factor) {
        this.factor = factor;
    }

    public void setPrice(int price) {
        this.price = price;
    }


    public String componentParts() {
        return null;
    }


    public static int getPrice() {
        return 0;
    }



}
