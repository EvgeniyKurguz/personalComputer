package com.epam.task1.entity;


public class PSU extends ComputerPart {
    private String name;
    private String connector;
    private int power; // in watt
    private int price;

    public PSU(String componentParts,String name,String connector,int power, int price ) {
        super(componentParts);
        this.setName(name);
        this.setConnector(connector);
        this.setPower(power);
        this.setPrice(price);
    }

    String getPeripherals() {
        return null;
    }

    @Override
    public String componentParts() {
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Блок питания: " +
                "Производитель='" + name + '\'' +
                ", Коннектор='" + connector + '\'' +
                ", Мощность= " + power + "W" +
                ", Цена=" + price + " Тенге;"
                ;
    }
}

