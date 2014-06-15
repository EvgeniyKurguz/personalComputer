package com.epam.task1.entity;


public  class Cooler extends ComputerPart  {
    private String name;
    private int noiseLevel;// dB
    private double powerConsumption; // in watt
    private int weight;
    private int price;

    public Cooler(String componentParts, String name, int noiseLevel,double powerConsumption,
                  int weight, int price) {
        super(componentParts);
        this.setName(name);
        this.setNoiseLevel(noiseLevel);
        this.setWeight(weight);
        this.setPrice(price);
    }

    public String getPeripherals() {
        return "";
    }

    @Override
   public String componentParts() {
        return "";
    }


   public static int getPrice() {
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoiseLevel() {
        return noiseLevel;
    }

    public void setNoiseLevel(int noiseLevel) {
        this.noiseLevel = noiseLevel;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(int powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cooler: " +
                "Модель='" + name + '\'' +
                ", Уровень шума=" + noiseLevel +"дб" +
                ", Потребляемая мощность=" + powerConsumption + "Вт"+
                ", Ширина=" + weight +
                ", price=" + price + " Тенге";
    }
}
