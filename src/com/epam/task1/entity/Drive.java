package com.epam.task1.entity;


public class Drive extends ComputerPart {

    private String interfaces;
    private String factor;

    @Override
    public String toString() {
        return "Дисковод: " +
               ", Интерфейс='" + interfaces + '\'' +
               ", Тип='" + factor + '\'';
    }

    public Drive(String name, String
            interfaces, String factor, int price ) {
        super(name, price);
        this.setInterfaces(interfaces);
        this.setFactor(factor);
         }

    String getPeripherals() {
        return null;
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

    public String componentParts() {
        return null;
    }


    @Override
    public String name() {
        return null;
    }

    public static int getPrice() {
        return 0;
    }



}
