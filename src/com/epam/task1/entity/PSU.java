package com.epam.task1.entity;


public class PSU extends ComputerPart {

    private String connector;
    private int power; // in watt

    public PSU(String name,String connector,int power, int price ) {
        super(name, price);

        this.setConnector(connector);
        this.setPower(power);

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

    @Override
    public String toString() {
        return "Блок питания: " +
                ", Коннектор='" + connector + '\'' +
                ", Мощность= " + power + "W";
    }

    @Override
    public String name() {
        return null;
    }
}

